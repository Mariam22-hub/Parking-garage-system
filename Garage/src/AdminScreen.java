import java.util.ArrayList;

public class AdminScreen {
	
	private int count;
	
	public void displaySlotsNumbersAvail(ArrayList<Slots> Slot) {
		for (int i = 0; i < Slot.size(); i++ ) {
			if (Slot.get(i).get_isEmpty() == true) {
				count ++;
			}
		}
		
		System.out.println("\nNumber of slots available = " + count + " Slots\n");
	}
	
	public void displayTotalIncome() {
		
	}
	
	
}
