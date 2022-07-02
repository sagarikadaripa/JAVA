package Arrays;
import java.util.*;
public class square {

    public ArrayList<Integer> sortedSquares(int[] nums) {
        
        int i;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(i = 0;i < nums.length;i++) {
            list.add(nums[i] * nums[i]);
            list.sort();
        }
        return (list);
    }  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        square s = new square();
        int arr[] = new int[5];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
     System.out.println(s.sortedSquares(arr));
    }
}
