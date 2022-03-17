package enums;


enum MobileCompany{
    APPLE(100), SAMSUNG(30), HTC(90);
	
	int price;
	MobileCompany()
	{
		price = 80;
		System.out.println("Constructor Calling...");
	}
	MobileCompany(int p)
	{
		price = p;
	}
	public int getPrice()
	{
		return price;
	}
}
public class enumConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MobileCompany.APPLE.getPrice());
	}

}
