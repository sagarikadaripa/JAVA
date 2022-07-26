package Arrays;
import java.util.*;
public class squareSorted {
    public static int[] sortedSquares(int[] nums) {
        int l = 0, h = nums.length - 1, idx = nums.length - 1;
        int res[] = new int[nums.length];
        while(l <= h){
            if(nums[l] * nums[l] >= nums[h] * nums[h]){
                res[idx] = nums[l] * nums[l];
                l++;
            }
            else{
                res[idx] = nums[h] * nums[h];
                h--;
            }
            idx--;
        }
        return res;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i = 0;i < nums.length;i++){
            nums[i] = sc.nextInt();
        }
        int res[] = sortedSquares(nums);
        for(int i = 0;i < res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
