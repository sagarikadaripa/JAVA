package recursion;

import java.util.Scanner;

public class reverseLinearBacktrackingRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number upto you want to print = ");
		int end = sc.nextInt();
		reverseLinear(1,end);
		
	}
	public static void reverseLinear(int start,int end)
	{
		if(start > end)
			return;
		else
		{		
			reverseLinear(start + 1,end);
			System.out.println(start);
		}
	}
}
