package enums;

enum Mobile{
    APPLE, SAMSUNG, HTC;
}
public class EnumEx {

	
	public static void main(String[] args) {
		
		Mobile m = Mobile.SAMSUNG;
		
		switch(m)
		{
		    case APPLE:
		        System.out.println("Apple is best");
		        break;
		    case SAMSUNG:
		        System.out.println("SAMSUNG is the best phone");
		}
	}
}
