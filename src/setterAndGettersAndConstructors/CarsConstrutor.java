package setterAndGettersAndConstructors;


//we can use constructors to initialize the properties of the car instead of using setter methods
public class CarsConstrutor {

		//properties of a car
		private String engine;
		private double speed;
		private String doors;
		private String windows;
		private String driver;
		
		//creating a parameterless constructor so that we can initialize the values of the properties
		public CarsConstrutor()
		{
			engine = "off";
			speed = 0.0;
			doors = "open";
			windows = "open";
			driver = "absent";
			
		}
		
		//Creating a parameterized constructor so that we can pass the values while calling this constructor
		public CarsConstrutor(String engine, double speed, String doors, String windows, String driver) {

			this.engine = engine;
			this.speed = speed;
			this.doors = doors;
			this.windows = windows;
			this.driver = driver;
		}

		//functionalities of a car
//		public void setEngine(String engine)
//		{
//			this.engine = engine;
//		}
		public String getEngine()
		{
			return engine;
		}
//		public void setSpeed(double speed)
//		{
//			this.speed = speed;
//		}
		public double getSpeed()
		{
			return speed;
		}
		public String getDoors() {
			return doors;
		}
//		public void setDoors(String doors) {
//			this.doors = doors;
//		}
		public String getWindows() {
			return windows;
		}
//		public void setWindows(String windows) {
//			this.windows = windows;
//		}
		public String getDriver() {
			return driver;
		}
//		public void setDriver(String driver) {
//			this.driver = driver;
//		}
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
