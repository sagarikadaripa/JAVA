package Arrays;
import java.util.*;
public class consecutiveOnes {
    public static int ones(int arr[],int n){
        int count = 0,maxCount = 0;
        for(int i = 0;i < n; i++){
            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }
            if(maxCount < count){
                maxCount = count;
            }     
        }
        return maxCount;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = ones(arr,n);
        System.out.println("RESULT = "+res);
    }
}
