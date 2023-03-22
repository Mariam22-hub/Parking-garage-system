
public class Vehicle {
	private String ModelName;
	private int ModelYear,id, slotId;
	private double depth,width;
	private int[] parkinTime;

		//constructor
	public Vehicle (String ModelName, int id, int ModelYear,double depth,double width){
		this.ModelName = ModelName;
		this.ModelYear = ModelYear; 
		this.id= id;
		this.depth = depth; 
		this.width = width;
	}
	
	public Vehicle() {}
	
	public void set_parkinTime(int [] t) {
		parkinTime = t;
	}
	
	public int[] get_parkinTime() {
		return parkinTime;
	}
	
	public void set_modelName(String name) {
		ModelName = name;
	}
	
	public void set_modelyear(int year) {
		ModelYear = year;
	}
	
	public void set_id (int id) {
		this.id = id;
	}
	
	public void set_slotID(int slotId) {
		this.slotId = slotId;
	}
	
	public void set_depth(double depth) {
		this.depth = depth;
	}
	
	public void set_width(double width) {
		this.width = width;
	}
	
	public String get_name() {
		return ModelName;
	}
	
	public int get_year() {
		return ModelYear;
	}
	
	public int get_id() {
		return id;
	}
	
	public double get_depth() {
		return depth;
	}
	
	public double get_width() {
		return width;
	}
	
	public int get_slotID() {
		return slotId;
	}
	
	
}


