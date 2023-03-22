import java.util.ArrayList;

public class DeallocateSlot {
	
	
	public void deallocate(ArrayList<Slots> slotArray, int slotId) {
		for (int i = 0; i < slotArray.size(); i++) {
			if (slotId == slotArray.get(i).get_id()) {
				slotArray.get(i).set_isEmpty(true);
			}
		}
	}
	
//	public DeallocateSlot(ArrayList<Slots> slotArray, int slotId) {
//		for (int i = 0; i < slotArray.size(); i++) {
//			if (slotId == slotArray.get(i).get_id()) {
//				slotArray.get(i).set_isEmpty(true);
//			}
//		}
//	}
}
