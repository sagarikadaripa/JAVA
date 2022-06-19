package JavaBasics;
import java.util.*;
public class MaxAndMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max) 
                max = arr[i];
        }
        System.out.println("min = "+min+" max = "+max);
    }
}
