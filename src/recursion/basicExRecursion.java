//learning basic of recursion. Concepts such as stack overflow and base condition/case is covered
package recursion;

public class basicExRecursion {

	private static int count = 0;

	public static void main(String[] args) {
		
		fun();
	}
	
	public static void fun() 
	{	
		//since we have no conditions when to stop the fun() this cause STACK OVERFLOW error
		//therefore to stop stack overflow issue we need to write a condition where this fun() should stop this is called BASIC CONDITION
		/*System.out.println("1");
		fun(); */
		
		
		//Writing base condition
		if(count == 5)
			return;
		else
		{
			System.out.println(count);
			count++;
			fun();
		}
		
	}
}

