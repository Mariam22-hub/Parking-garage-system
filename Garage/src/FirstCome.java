import java.util.ArrayList;

public class FirstCome implements Configuration {
	
	public Vehicle car;
	public Slots slot;
	public CustomerScreen display;
	
	public FirstCome() {}

	public int suitableSlot(ArrayList<Slots> thisSlot, Vehicle thisCar) {
		
		int chosenSlot = -1;
		
		for (int i = 0; i<thisSlot.size(); i++) {
			if (thisSlot.get(i).get_isEmpty() == true) {
				
				chosenSlot = thisSlot.get(i).get_id();
				thisSlot.get(i).set_isEmpty(false);
				
				break;
			}
		}
		
		if (chosenSlot == -1) {
			
			System.out.println("No Slots Available in the Parking Garage");	
			return -1;
			
		}
		else {
			
			thisCar.set_slotID(chosenSlot);
			
			System.out.println("Slot " + chosenSlot + " has been chosen for you\n");
			
			ParkedCars.parkedCars.add(thisCar);
			
			return chosenSlot;
		}
		

		
	}
}
