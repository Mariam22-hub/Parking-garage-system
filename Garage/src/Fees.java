

public class Fees {
	int fee;
	int hrs, mins;
	final int RATE = 5;
	
	// Constructor
	public Fees() {
		fee = 0;
	}
	
	// Calculate and return fee
	public int CalculateFee(int[] arrivalTime, int[] departureTime) {
		int arr_day = arrivalTime[0], arr_hr = arrivalTime[1], arr_min = arrivalTime[2], 
		    dep_day = departureTime[0], dep_hr = departureTime[1], dep_min = departureTime[2];
		
		if(arr_day == dep_day) {
			// if departure minute greater than arrival minute
			if(dep_min>arr_min) {
				mins = dep_min - arr_min;
				hrs = dep_hr - arr_hr;
				
				if(mins>0) {
					fee = (hrs+1)*RATE;
				}
				else {
					fee = hrs*RATE;
				}
			}
			else if(dep_hr==arr_hr) {
				fee = RATE;
			}
			// if departure minute less than arrival minute
			else if(dep_min<arr_min) {
				dep_min += 60;
				dep_hr -= 1;
				
				mins = dep_min - arr_min;
				hrs = dep_hr - arr_hr;
				
				if(mins>0) {
					fee = (hrs+1)*RATE;
				}
				else {
					fee = hrs*RATE;
				}
			}
		}
		
		/*if(arr_day < dep_day) {
			
		}*/
		
		
		// Add the fee to income
		Income incomeObj = new Income();
		incomeObj.addFee(fee);
		
		return fee;
	}
}
