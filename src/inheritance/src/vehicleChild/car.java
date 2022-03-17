package vehicleChild;

import vehicleParent.vehicle;

public class car extends vehicle{
	
	private String steering;
	private String musicSystem;
	private String airConditioner;
	private String entertainmentSystem;
	private String fridge;
	
	public car() {
		this.steering = "present";
		this.musicSystem = "present";
		this.airConditioner = "present";
		this.entertainmentSystem = "present";
		this.fridge = "not present";
		
	}
	public car(String steering, String musicSystem, String airConditioner, String entertainmentSystem, String fridge) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
		this.airConditioner = airConditioner;
		this.entertainmentSystem = entertainmentSystem;
		this.fridge = fridge;
	}
	
	public String getSteering() {
		return steering;
	}
	public String getMusicSystem() {
		return musicSystem;
	}
	public String getAirConditioner() {
		return airConditioner;
	}
	public String getEntertainmentSystem() {
		return entertainmentSystem;
	}
	public String getFridge() {
		return fridge;
	}
	@Override
	public String toString() {
		return "car [getSteering()=" + getSteering() + ", getMusicSystem()=" + getMusicSystem()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getEntertainmentSystem()="
				+ getEntertainmentSystem() + ", getFridge()=" + getFridge() + ", getWheels()=" + getWheels()
				+ ", getSeats()=" + getSeats() + ", getEngine()=" + getEngine() + ", getFuelTank()=" + getFuelTank()
				+ ", getLights()=" + getLights() + "]";
	}
	
	
	
	
	
}
