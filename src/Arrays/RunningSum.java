package Arrays;
import java.util.*;
public class RunningSum {

    public int[] runningSum(int nums[]){

        for(int i = 1;i < nums.length;i++){
            nums[i] = nums[i] + nums[i - 1];  
        }   

        return nums;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the the size of the array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("enter the elements of the array = ");
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        RunningSum r = new RunningSum();
        int res[] = r.runningSum(arr);
        System.out.println("--------------------------------------------------------");
        for(int i = 0;i < res.length;i++){
            System.out.println(res[i]);
        }        
    }
}
