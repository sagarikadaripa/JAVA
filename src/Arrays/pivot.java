package Arrays;
import java.util.*;
public class pivot {
    //step 1 - calculationg the total sum of the array 
    //step 2 - substractiong sum from the current value
    //step 3 -comparing it with the left sum if it is equal then returning the current index else
        //adding the current value to the left sum
    //O(n)
    public int solutionOptimized(int[] arr){
        int sum = 0; // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
 
        /* Find sum of the whole array */
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
 
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i]; // sum is now right sum for index i
 
            if (leftsum == sum)
                return i;
 
            leftsum += arr[i];
        }
 
        /* If no equilibrium index found, then return 0 */
        return -1;
    }
    //my approach 
    public int pivotIndex(int[] nums) {
        
        int pivot = 0,i;
        int sum_left = 0;
        int sum_right = 0;
        while(pivot < nums.length){
            for(i = 0; i < pivot; i++){
                sum_left = sum_left + nums[i];
            }
            for(int j = pivot + 1;j < nums.length; j++){
                sum_right = sum_right + nums[j];
            }
            if(sum_left == sum_right){
                pivot = i;
                break;
            }         
            else{
                if(pivot == nums.length - 1)
                {
                    pivot = -1; 
                    break;
                }
                else{
                    pivot++;  
                    sum_left = 0;
                    sum_right = 0;
                }
            }
        }    
       return pivot;  //O(n*n)
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i = 0;i < nums.length;i++){
            nums[i] = sc.nextInt();
        }
        pivot p = new pivot();
        // int res = p.pivotIndex(nums);
        int res = p.solutionOptimized(nums);
        System.out.println("Index = "+res);
    }
}
