package Arrays;
import java.util.*;
public class unique {
    public static void nonRepeat(int arr[],int n){
        Arrays.sort(arr);
        if(arr[0] != arr[1])
            System.out.println(arr[0]);
        for(int i = 1; i < n - 1;i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1])
            System.out.println(arr[i]);
        }
        if(arr[n-1] != arr[n-2])
        System.out.println(arr[n-1]);
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4,4,5,6,6,6,6,7};
        nonRepeat(arr,arr.length);
    }
}
