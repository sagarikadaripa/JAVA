//printing 1 to N using recursion

package recursion;

import java.util.Scanner;

public class linearPrintRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number upto you want to print = ");
		int num = sc.nextInt();
		linear(1,num);
	}
	
	public static void linear(int start,int end)
	{
		if(start > end)
			return;
		else
		{
			System.out.println(start);
			linear(start + 1,end);
		}
	}
}

//Time Complexity is O(n) because N times the function names is getting called
//Space complexity is usually the STACK SPACE taken which is O(n)