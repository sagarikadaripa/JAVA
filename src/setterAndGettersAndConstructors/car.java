package setterAndGettersAndConstructors;

public class car {
	
	//properties of a car
	private String engine;
	private double speed;
	private String doors;
	private String windows;
	private String driver;
	
	//functionalities of a car
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	public String getEngine()
	{
		return engine;
	}
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	public double getSpeed()
	{
		return speed;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String runCar()
	{
		if(doors.equalsIgnoreCase("closed") && driver.equalsIgnoreCase("seated") && speed > 0.0 && engine.equalsIgnoreCase("on"))
		{
			return "Car is Running";
		}
		else
		{
			return "car not started";
		}
	}
	
}
