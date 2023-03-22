import java.util.ArrayList;

public class BestFit implements Configuration {
	
	public Vehicle car;
	public Slots slot;
	public CustomerScreen display;
	
	public BestFit() {}
	
	public int suitableSlot(ArrayList<Slots> thisSlot, Vehicle thisCar) {
		 
		double minArea = 5000.00;
		int chosenSlot = -1;
		int index = 0;
		
		for (int i= 0; i< thisSlot.size(); i++) {
			if (thisSlot.get(i).get_isEmpty() == true) {
				
				if (thisCar.get_depth() < thisSlot.get(i).get_depth() && thisCar.get_width() < thisSlot.get(i).get_width()) {
					
					if (thisSlot.get(i).get_area() < minArea) {
						
						minArea = thisSlot.get(i).get_area();
						chosenSlot = thisSlot.get(i).get_id();
						index = i;
					}
				}
			}
		}
		
		if (chosenSlot == -1) {
			System.out.println("No Slots Available in the Parking Garage\n");	
			return -1;
		} 
		else {
			
			thisCar.set_slotID(chosenSlot);
			thisSlot.get(index).set_isEmpty(false);
			
			System.out.println("Slot " + chosenSlot + " has been chosen for you\n");
//			display.displayChosenSlot(thisCar);
			
			ParkedCars.parkedCars.add(thisCar);
			
			return chosenSlot;
		}
		
		
	}
	
}
