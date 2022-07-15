package Arrays;
import java.util.*;
public class CheckDuplicateEle {
    public static boolean checkDuplicate(int arr[],int n){
        for(int i = 0;i < n; i++){
            for(int j = i + 1;j < n; j++){
                if(arr[i] == arr[j])    return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean check = checkDuplicate(arr,n);
        System.out.println(check);
        sc.close();
    }
}
