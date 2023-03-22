import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	static int size;
	static int typpe;
	
    public static void main(String[] args) throws IOException {
    	
    	
    	System.out.println("Welcome to the Garage! \n");
    	
    	//entering number of slots
    	Scanner s = new Scanner(System.in);
    	System.out.println("Please choose the number of slots accessible in the parking");
    	size = s.nextInt();
    	
    	ArrayList<Slots> listOfSlots = new ArrayList<Slots>();
        addSlots(listOfSlots);
        
        System.out.println("--------------------------------------------------------------------------");
        
    	System.out.println("1. Best Fit configuration");
        
        System.out.println("2. First come first served configuration\n");
        
        Scanner t = new Scanner(System.in);
    	System.out.println("Please choose a configuration");
    	typpe = t.nextInt();
    	
    	
    	System.out.println("--------------------------------------------------------------------------");
    	
    	while(true) {
    		
    		System.out.println("To exit program, type 0");
        	
    		System.out.println("If you're a Garage Owner, type 1 ");
            
        	System.out.println("If you're a Car Owner, type 2\n");
        	
            Scanner i = new Scanner(System.in);
        	System.out.println("Please choose a mode");
        	int mode = i.nextInt();
    		
        	
    		if (mode == 1) {
    			System.out.println("1.Display Income");
    			System.out.println("2.Display number of vehicles in the garage");
    			
    			
            	Scanner choice = new Scanner(System.in);
            	System.out.println("ENTER your choice: \n");
 	            int ch = choice.nextInt();
 	            
 	            if (ch == 1) {
 	            	Income total = new Income();
 	            	System.out.println("The total income is: "+ total.getIncome());
 	            }
 	            
 	            else if (ch == 2) {
 	            	System.out.println("Number of vehicles: " + ParkedCars.parkedCars.size() + " Vehicles");   
 	            }
    			
    		}
    		
    		else if (mode == 2) {
    			

    			//BEST FIT 
    			if (typpe == 1) {
            		
                    Type type = new Type();
                    type.set_name("BestFit");
                    
                	
                	System.out.println("Choose from the following options: ");
                	System.out.println("0. Exit\n");
                	System.out.println("1. Park In");
                	System.out.println("2. Park Out \n");
                  
                	Scanner choice = new Scanner(System.in);
                	System.out.println("ENTER your choice:");
     	            int ch = choice.nextInt();
     	            
     	            if (ch == 1) {
     	            	
            			System.out.println("ENTER Model Name:");
                        Scanner addModelName = new Scanner(System.in);
                        String ModelName = (addModelName.nextLine());

                        System.out.println("ENTER Model Year:");
                        Scanner addModelYear = new Scanner(System.in);
                        int ModelYear = (addModelYear.nextInt());
                        
                        System.out.println("ENTER ID:");
                        Scanner addID = new Scanner(System.in);
                        int id = (addID.nextInt());
                        
                        System.out.println("ENTER Depth:");
                        Scanner addDepth = new Scanner(System.in);
                        double depth = (addDepth.nextDouble());
                        
                        System.out.println("ENTER Width:");
                        Scanner addWidth = new Scanner(System.in);
                        double width = (addWidth.nextDouble());
                    	
                        Vehicle V = new Vehicle(ModelName, id, ModelYear , depth, width);
     	        	  
	                    	
                    	BestFit bestfit = new BestFit();
                    	type.set_type(bestfit);
     	        	  
                    	Parkin p = new Parkin (listOfSlots, V, type);

     	            }
     	            
     	            else if (ch == 2) {
     	        	  
                    	Scanner carid = new Scanner(System.in);
                  	  	System.out.println("Enter your car ID:");
                  	  	int id = carid.nextInt();
                  	  	int flag = 0;
       	              
                  	  	for(int ind=0; ind< ParkedCars.parkedCars.size(); ind++) {
                  	  		
                  	  		if(ParkedCars.parkedCars.get(ind).get_id() == id) {
                  	  			
                  	  			Parkout out = new Parkout(ParkedCars.parkedCars.get(ind));
       	        			  
                  	  			DeallocateSlot d = new DeallocateSlot();
                  	  			d.deallocate(listOfSlots, ParkedCars.parkedCars.get(ind).get_slotID());
       	        			
                  	  			CarDeallocation cd = new CarDeallocation();
                  	  			cd.deallocateCar(id);
                  	  			flag = 1;
                  	  			break;
                  	  		} 
                  	  	}
                  	  	
                  	  	if (flag == 1) {
              	  			System.out.println("Car of ID " + id + " Parked out successfully!\n");
                  	  	} else {
              	  			System.out.println("Error. Car Could Not be Found on the System.\n");
                  	  	}

     	            }
     	            
     	            else if (ch == 0) {
     	            	return;
     	            }
     	            
    			}
    			
    			//FIRST COME
            	else if (typpe == 2) {
            		
                    Type type = new Type();
                    type.set_name("FirstCome");
                    
                	
                	System.out.println("Choose from the following options: ");
                	System.out.println("0. Exit");
                	System.out.println("1. Park In");
                	System.out.println("2. Park Out\n");
                  
                	Scanner choice = new Scanner(System.in);
                	System.out.println("ENTER your choice:");
                	int ch = choice.nextInt();
                	
                	
                    if (ch == 1) {
                    	
            			System.out.println("ENTER Model Name:");
                        Scanner addModelName = new Scanner(System.in);
                        String ModelName = (addModelName.nextLine());

                        System.out.println("ENTER Model Year:");
                        Scanner addModelYear = new Scanner(System.in);
                        int ModelYear = (addModelYear.nextInt());
                        
                        System.out.println("ENTER ID:");
                        Scanner addID = new Scanner(System.in);
                        int id = (addID.nextInt());
                        
                        System.out.println("ENTER Depth:");
                        Scanner addDepth = new Scanner(System.in);
                        double depth = (addDepth.nextDouble());
                        
                        System.out.println("ENTER Width:");
                        Scanner addWidth = new Scanner(System.in);
                        double width = (addWidth.nextDouble());
                    	
                        Vehicle V = new Vehicle(ModelName, id, ModelYear , depth, width);
                    	
 	
                    	FirstCome firstcome = new FirstCome();
                  	  	type.set_type(firstcome);
                  	  
                  	  	Parkin p = new Parkin (listOfSlots, V, type);

                    } 
                    else if (ch == 2) {
                    	
                    	Scanner carid = new Scanner(System.in);
                  	  	System.out.println("Enter your car ID:");
                  	  	int id = carid.nextInt();
                  	  	int flag = 0;
       	              
                  	  	for(int ind=0; ind < ParkedCars.parkedCars.size(); ind++) {
                  	  		
                  	  		if(ParkedCars.parkedCars.get(ind).get_id() == id) {
                  	  			
                  	  			Parkout out = new Parkout(ParkedCars.parkedCars.get(ind));
       	        			  
                  	  			DeallocateSlot d = new DeallocateSlot();
                  	  			d.deallocate(listOfSlots, ParkedCars.parkedCars.get(ind).get_slotID());
       	        			
                  	  			CarDeallocation cd = new CarDeallocation();
                  	  			cd.deallocateCar(id);
                  	  			flag = 1;
                  	  			break;
                  	  		} 
                  	  	}
                  	  	
                  	  	if (flag == 1) {
              	  			System.out.println("Car of ID " + id + " Parked out successfully!");
                  	  	} else {
              	  			System.out.println("Error. Car Could Not be Found on the System.");
                  	  	}
                   	}
                    
                    else if (ch == 0) {
                   		return;
                   	}
            	}
    		}
    		else if (mode == 0) {
    			return;
    		}
    	}
          
    }
        
   	
 

	private static void addVehicle(Vehicle v) {
		
            
			System.out.println("ENTER Model Name:");
            Scanner addModelName = new Scanner(System.in);
            String ModelName = (addModelName.nextLine());

            System.out.println("ENTER Model Year:");
            Scanner addModelYear = new Scanner(System.in);
            int ModelYear = (addModelYear.nextInt());
            
            System.out.println("ENTER ID:");
            Scanner addID = new Scanner(System.in);
            int id = (addID.nextInt());
            
            System.out.println("ENTER Depth:");
            Scanner addDepth = new Scanner(System.in);
            double depth = (addDepth.nextDouble());
            
            System.out.println("ENTER Width:");
            Scanner addWidth = new Scanner(System.in);
            double width = (addWidth.nextDouble());

            v = new Vehicle(ModelName, id, ModelYear , depth, width);

		
	}
    
    private static void addSlots(ArrayList<Slots> listOfSlots) {
		
		for (int i = 0; i < size; i++) {
            
			System.out.println("ENTER Width:");
            Scanner addwidth = new Scanner(System.in);
            double width = (addwidth.nextDouble());

            System.out.println("ENTER Depth:");
            Scanner addDepth = new Scanner(System.in);
            double depth = (addDepth.nextDouble());
            
            System.out.println("ENTER ID:");
            Scanner addID = new Scanner(System.in);
            int Slotid = (addID.nextInt());
            
            System.out.println("ENTER Availability (Type 'true' or 'false' :");
            Scanner isEmpty = new Scanner(System.in);
            boolean isEmpty1 = (addDepth.nextBoolean());

            listOfSlots.add(new Slots(width, depth, Slotid , isEmpty1));
        }
        for (Slots list : listOfSlots) {
            System.out.println("Width: " + list.get_width() + ", Depth: " + list.get_depth()+ ", ID: " + list.get_id() + " , Availability: " + list.get_isEmpty());
        }
		
	}
	
	
}
	
	








//public class Main {
//	public static void main(String[] args){
//
//		ArrayList<Vehicle> VehcileInfo = new ArrayList<Vehicle> (); //ArrayList
//			
//		Vehicle vehcile1 = new Vehicle("BMW",123, 2023,20.0,12.4);
//		Vehicle vehcile2 = new Vehicle("Ford",456,2022,15.5,10);
//		Vehicle vehcile3 = new Vehicle("Kia",789,2000,7,8);
//			
//			
//		VehcileInfo.add(vehcile1);
//		VehcileInfo.add(vehcile2);
//		VehcileInfo.add(vehcile3);
//			
//		System.out.println(VehcileInfo.get(0).get_name()+ ","+VehcileInfo.get(0).get_id() + " ,"+VehcileInfo.get(0).get_year()+ " ,"+VehcileInfo.get(0).get_width()+ " , "+VehcileInfo.get(0).get_depth());
//		System.out.println(VehcileInfo.get(1).get_name()+ ","+VehcileInfo.get(1).get_id() + " ,"+VehcileInfo.get(1).get_year()+ " ,"+VehcileInfo.get(1).get_width()+ " , "+VehcileInfo.get(1).get_depth());
//		System.out.println(VehcileInfo.get(2).get_name()+ ","+VehcileInfo.get(2).get_id() + " ,"+VehcileInfo.get(2).get_year()+ " ,"+VehcileInfo.get(2).get_width()+ " , "+VehcileInfo.get(2).get_depth());
//		
//		ArrayList<Slots> slotsInfo = new ArrayList<Slots>();
//		
//		Slots slot1 = new Slots(10.0, 12.0, 1, true);
//		Slots slot2 = new Slots(15.0, 13.0, 2, true);
//		Slots slot3 = new Slots(10.0, 12.0, 3, true);
//		
//		slotsInfo.add(slot1);
//		slotsInfo.add(slot2);
//		slotsInfo.add(slot3);
//		
//	}
//}
