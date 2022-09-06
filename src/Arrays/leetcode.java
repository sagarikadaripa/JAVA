package Arrays;

public class leetcode {
    public static boolean findSubarrays(int[] nums) {
        
        if(nums.length < 2) return false;
        int x = 0,j = 0,m = x + 1;
        while(j < nums.length){
            for(int i = m;i < nums.length - 1;i++){ 
                int start = nums[x], end = nums[x+1];
                int startSum = start + end;
                if(nums[i] + nums[i+1] != startSum && i < nums.length){
                    continue;
                }
                 else if(nums[i] + nums[i+1] != startSum && i > nums.length - 1) {
                     x+=1;
                     i = x + 1;
                 }  
                else
                    return true;
                 j++;
                 if(i >= nums.length - 1){
                    m = x+ 1;
                    i = m;
                 }
            }
        }
       
        return false;
    }
    public static void main(String[] args){
        int arr[] = {77,95,90,98,8,100,88,96,6,40,86,56,98,96,40,52,30,33,97,72,54,15,33,77,78,8,21,47,99,48};
        boolean ans = findSubarrays(arr);
        System.out.println(ans);
    }
}
