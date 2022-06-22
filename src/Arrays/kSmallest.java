package Arrays;
import java.util.*;
public class kSmallest {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("enter the elements of the array = ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the value of k = ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int small = 0;
        for(int i = 0;i < arr.length; i++)
        {
            if( (i + 1) == k){
                small = arr[i];
            }
        }
        System.out.println(small);
        sc.close();
    }
}
