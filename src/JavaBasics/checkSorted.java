package JavaBasics;
import java.util.*;
public class checkSorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        boolean isSortedAsc = true;
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] > arr[i+1])
                isSortedAsc = false;
        }
        if(isSortedAsc)
            System.out.println("It is sorted in ascending order");
        else
        System.out.println("It is not sorted in ascending order");
    }
}
