package Arrays;
public class sample {
    public static int maxSum(int arr[],int n){

        int max = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < n;i++){
            sum = sum + arr[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        
    }
}

