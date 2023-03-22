
public class Income {
	static int total_income;
	
	public void addFee(int fee) {
		total_income += fee;
	}
	public int getIncome() {
		return total_income;
	}
}

