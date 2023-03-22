
public class CarDeallocation {
	
	public void deallocateCar(int id) {
		
		for (int i = 0; i < ParkedCars.parkedCars.size(); i++ ) {
			if (ParkedCars.parkedCars.get(i).get_id() == id) {
				ParkedCars.parkedCars.remove(i);
			}
		}
	}
	

}
