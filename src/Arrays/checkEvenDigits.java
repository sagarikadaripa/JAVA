package Arrays;
import java.util.*;
public class checkEvenDigits {
    public static int checkEven(int arr[],int n){
        int count = 0,digitsCount = 0;
        for(int i = 0;i < n;i++){
            int temp = arr[i];
            while(temp > 0){
                temp = temp / 10;
                digitsCount++;
            }
            if(digitsCount%2 == 0){count++;}
            digitsCount = 0;
        }
        return count;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = checkEven(arr,n);
        System.out.println("RESULT = "+res);
    }
}
