//printing Your name N times using recursion

package recursion;

import java.util.Scanner;

public class namesRecurion {
	
	private static final String name = "Sagarika";
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number upto you want to print the names = ");
		int num = sc.nextInt();
		names(1,num);
	}
	public static void names(int start,int end)
	{
		if(start > end) //Base condition
			return;
		else
		{
			System.out.println(name);
			names(start+1,end);
		}
	}
}
//Time Complexity is O(n) because N times the function names is getting called
//Space complexity is usually the STACK SPACE taken which is O(n)