package vehicleChild;

import vehicleParent.vehicle;

public class bike extends vehicle {

	private String Handle;
	
	//for assigning values we will be using parameterless constructors instead of setter methods.
	public bike(){	
		super(); //call to our default constructor ie., vehicleParent.vehicle.vehicle()
		this.Handle = "short";
	}
	

	public bike(String handle,int wheels, int seats, String engine, int fuelTank, String lights) {
		super(wheels,seats,engine,fuelTank,lights);
		this.Handle = handle;
	}

	public String getHandle() {
		return Handle;
	}


	@Override
	public String toString() {
		return "bike [getHandle()=" + getHandle() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getEngine()=" + getEngine() + ", getFuelTank()=" + getFuelTank() + ", getLights()=" + getLights()
				+ "]";
	}
	
}
