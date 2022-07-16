package Arrays;
import java.util.*;
public class roatateArrayK {
    public static void reverse(int arr[],int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        d = d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
    public static void Display(int arr[],int n){
        for(int i = 0;i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotateArr(arr,d,n);
        System.out.println("----------------------------");
        Display(arr,n);
    }
}
