package Integers;
import java.util.*;
public class GCDArray {
    public static int gcdR(int a,int b){

        if(b == 0) return a;
        return gcdR(b,a%b);
    }
    public static int findGCD(int arr[],int n){
        int result = arr[0];
        for (int element: arr){
            result = gcdR(result, element);
  
            if(result == 1)
            {
               return 1;
            }
        }
  
        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array = ");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array = ");
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("GCD of the array is = "+findGCD(arr, n));        
    }
}
