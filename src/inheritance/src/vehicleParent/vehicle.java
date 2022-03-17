package vehicleParent;

public class vehicle {

	//common properties of car, bike, truck
	//access type of the parent class properties are usually private
	//to access the private properties we use constructors
	private int wheels;
	private int seats;
	private String engine;
	private int fuelTank;
	private String lights;
	
	
	//assigning default values in the non-parameterized constructor
	public vehicle(){
		this.wheels = 4;
		this.seats = 4;
		this.engine = "petrol";
		this.fuelTank = 35;
		this.lights = "LED";
		
	}
	
	//for adding custom values we need parameterized constructor
	public vehicle(int wheels, int seats, String engine, int fuelTank, String lights) {
		
		this.wheels = wheels;
		this.seats = seats;
		this.engine = engine;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public String getEngine() {
		return engine;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}
	
	
	
}
