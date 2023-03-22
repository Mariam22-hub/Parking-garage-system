import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Parkout {
	int [] timeday_dep;

	public Parkout(Vehicle v) {
		// CAPTURE AND ASSIGN DEPARTURE TIME
		Date date = new Date();   // given date
		Calendar calendar = GregorianCalendar.getInstance(); // creates a new calendar instance
		calendar.setTime(date);   // assigns calendar to given date 
					
		timeday_dep = new int [] {calendar.get(Calendar.DAY_OF_MONTH),
					              calendar.get(Calendar.HOUR_OF_DAY),
						          calendar.get(Calendar.MINUTE)};
		
		Fees feeObj = new Fees();
		int fee = feeObj.CalculateFee(timeday_dep, v.get_parkinTime());
		
		System.out.println("The Total Fee Is: "+ fee + "\n");
		
	}
	
	
	/*public static void main(String[] args) {
		Parkout p = new Parkout();
		System.out.println(p.timeday_dep[1]);
    }*/
}
