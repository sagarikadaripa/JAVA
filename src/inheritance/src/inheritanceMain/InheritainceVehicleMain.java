package inheritanceMain;

import vehicleChild.bike;
import vehicleChild.car;

public class InheritainceVehicleMain {

	public static void main(String[] args) {
		
		//for calling the parameterless constructors we have created the bike() constructor without passing any parameter
	/*	bike bike = new bike();
		System.out.println(bike.getHandle());
		System.out.println(bike.getEngine());
		System.out.println(bike.getFuelTank());
		System.out.println(bike.getLights());
		System.out.println(bike.getSeats());
		System.out.println(bike.getWheels());
	*/
		
		//for calling the parameterized constructor we will pass the parameter
		bike honda = new bike("long", 4, 4, "Diesel", 0, null);
		/*
		System.out.println(honda.getHandle());
		System.out.println(honda.getEngine());
		System.out.println(honda.getFuelTank());
		System.out.println(honda.getLights());
		System.out.println(honda.getSeats());
		System.out.println(honda.getWheels());
		*/ 
		//instead of printing each a every get method using sysout we will print the honda object
		//System.out.println(honda);
		
		
		car car = new car();
		System.out.println(car);
	}

}
