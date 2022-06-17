package JavaBasics;
public class car {
    
    private double price;
    private String engine;
    private String colour;
    private int capacity;
    private String fuel_type;

    public void setPrice(){ price = 100.00;}
    public void setFuelType(){ fuel_type = "petrol";}
    public void setEngine(){ engine = "petrol Engine";}
    public void setColor(){ colour = "black";}
    public void setCapacity(){ capacity = "125";}


    public double getPrice(){ return price;}
    public String getEngine(){ return engine;}
    public String getColor(){ return colour;}
    public int getCapacity(){ return capacity;}
    public String getFuelType(){ return fuel_type;}
}
