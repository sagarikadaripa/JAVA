package setterAndGettersAndConstructors;

import java.util.*;

public class CarMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("enter the speed of the car: ");  //Asking user to enter the values
//		double speed = sc.nextDouble();
		
		//creating the object of the car class to access the methods or functionalities of the car class
		car tata =  new car();
		
		//initializing using setter methods
//		tata.setEngine("ON");
//		tata.setDoors("closed");
//		tata.setSpeed(12.00);
//		tata.setWindows("open");
//		tata.setDriver("seated");
		
		
		//calls the paramterless constructor if nothing is passed in the paramter
//		Cars cars = new Cars();
//		System.out.println(cars.runCar());
		
		//Calls the parameterized constructor as we are passing the values
		CarsConstrutor cars = new CarsConstrutor("on",9.76,"closed","closed","seated");
		System.out.println(cars.runCar());
		
		
		//without initializing or giving the values of the setter methods we CANNOT call the runCar() as it throws a Null pointer Exception that the values not provided
		//System.out.println(tata.runCar());		
	}

}
