package recursion;
import java.util.*;
public class printArrayForward {
    public static void arrayForward(int arr[],int c){
        if(arr.length - 1 < c)  return;
        System.out.println(arr[c]);
        arrayForward(arr,c+1);
    }
    public static void arrayBackward(int arr[],int i){
        if(i < 0)  return;
        System.out.println(arr[i]);
        arrayBackward(arr,i-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("----------------------");
        arrayForward(arr,0);
        System.out.println("----------------------");
        arrayBackward(arr,n-1);
    }
}
