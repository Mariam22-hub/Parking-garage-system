
public class Slots {
	
	private double width;
	private double depth;
	private int slotID;
	private boolean isEmpty;
	
	
	//setters and getters
	public void set_with(double w) {
		width = w;
	}
	
	public void set_depth(double d) {
		depth = d;
	}
	
	public void set_id(int id) {
		slotID = id;
	}
	
	public void set_isEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	
	public double get_width() {
		return width;
	}
	
	public double get_depth() {
		return depth;
	}
	
	public int get_id() {
		return slotID;
	}
	
	public boolean get_isEmpty() {
		return isEmpty;
	}
	
	public double get_area() {
		return width * depth;
	}
	
	//constructors
	public Slots(double width,double depth, int slotID, boolean isEmpty) {
		this.depth = depth;
		this.width = width;
		this.slotID = slotID;
		this.isEmpty = isEmpty;
	}
}
