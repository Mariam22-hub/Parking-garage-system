import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Parkin{	
	int [] timeday_arrival;

	
	public Parkin(ArrayList<Slots> slot, Vehicle vec, Type t) {
		
		int carslot = t.getConfig_Type().suitableSlot(slot, vec);
		
		if(carslot == -1) {
			System.out.println("Sorry, there are no slots available");
			return;
		}
		else {
		
			// ASSIGN SLOT
			vec.set_slotID(carslot);
		
			// CAPTURE AND ASSIGN ARRIVAL TIME
			Date date = new Date();   // given date
			Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
			calendar.setTime(date);   // assigns calendar to given date 
		
			timeday_arrival = new int[] {calendar.get(Calendar.DAY_OF_MONTH),
				                     calendar.get(Calendar.HOUR_OF_DAY),
						             calendar.get(Calendar.MINUTE)};	
			
			//int hour = calendar.get(Calendar.HOUR_OF_DAY), minute = calendar.get(Calendar.MINUTE), day = calendar.get(Calendar.DAY_OF_MONTH);
			vec.set_parkinTime(timeday_arrival);
		}

	}
	
//	public void park(Type t) {
//		int carslot = t.getConfig_Type().suitableSlot(s, v);
//		
//		if(carslot == -1) {
//			System.out.println("Sorry, there are no slots available");
//			return;
//		}
//		
//		else {
//			
//			// ASSIGN SLOT
//			v.set_slotID(carslot);
//			
//			// CAPTURE AND ASSIGN ARRIVAL TIME
//			Date date = new Date();   // given date
//			Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
//			calendar.setTime(date);   // assigns calendar to given date 
//			
//			timeday_arrival = new int[] {calendar.get(Calendar.DAY_OF_MONTH),
//					                     calendar.get(Calendar.HOUR_OF_DAY),
//							             calendar.get(Calendar.MINUTE)};	
//			//int hour = calendar.get(Calendar.HOUR_OF_DAY), minute = calendar.get(Calendar.MINUTE), day = calendar.get(Calendar.DAY_OF_MONTH);
//			v.set_parkinTime(timeday_arrival);
//		}
//		
//		
//	}
	
	
	
//	public Parkin(ArrayList<Slots> Slot,Vehicle v) {
//		Configuration config = new BestFit();
//		int carslot = config.suitableSlot(Slot, v);
//		
//		if(carslot == -1) {
//			System.out.println("Sorry, there are no slots available");
//			return;
//		}
//		
//		else {
//			// ASSIGN SLOT
//			v.set_slotID(carslot);
//			
//			// CAPTURE AND ASSIGN ARRIVAL TIME
//			Date date = new Date();   // given date
//			Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
//			calendar.setTime(date);   // assigns calendar to given date 
//			
//			timeday_arrival = new int[] {calendar.get(Calendar.DAY_OF_MONTH),
//					                     calendar.get(Calendar.HOUR_OF_DAY),
//							             calendar.get(Calendar.MINUTE)};	
//			//int hour = calendar.get(Calendar.HOUR_OF_DAY), minute = calendar.get(Calendar.MINUTE), day = calendar.get(Calendar.DAY_OF_MONTH);
//			v.set_parkinTime(timeday_arrival);
//		}	
//	}
}


