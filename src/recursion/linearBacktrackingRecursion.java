//printing 1 to N using recursion but backtracking
package recursion;

import java.util.Scanner;

public class linearBacktrackingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number upto you want to print = ");
		int num = sc.nextInt();
		linear(num,num);
		sc.close();
	}
	public static void linear(int start,int end)
	{
		if(start < 1)
			return;
		else
		{
			linear(start - 1,end);
			System.out.println(start);
		}
	}
}
