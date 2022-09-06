package Arrays;

public class duplicate {
    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args){

        int arr[] = {3,1,3,4,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
    
}
