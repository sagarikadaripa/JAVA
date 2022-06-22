
    /*package whatever //do not write package name here */
package Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

public class reverseArray {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of Test cases you want to test with = ");
		int T = sc.nextInt(); //number of test cases
		while(T > 0){
		    //taking input the number of times the Test cases are
            System.out.print("enter the size of the array = ");
		    int n = sc.nextInt();
		    int arr[] = new int[n];
            System.out.print("enter the elements of the array = ");
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    //reversing the array logic
		    for(int i=0;i<n/2;i++){
                 int temp = arr[i];
                 arr[i] = arr[n-i-1];
                 arr[n-i-1] = temp;
            }
 
            //printing the array after reversing the array
             for(int i=0;i<n;i++)
                 System.out.print(arr[i]+" ");


             System.out.println();
             T--;
		}		
	sc.close();
	}
}

