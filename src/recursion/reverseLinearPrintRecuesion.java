package recursion;

import java.util.Scanner;

public class reverseLinearPrintRecuesion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number upto you want to print = ");
		int end = sc.nextInt();
		reverseLinear(end,1);
	}
	public static void reverseLinear(int end,int start)
	{
		if(end < start)
			return;
		else
		{
			System.out.println(end);
			end--;
			reverseLinear(end,start);
		}
	}
}
