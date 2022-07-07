package Arrays;
import java.util.*;
public class searchingKey {
    public static int searchKey(int arr[],int n,int key){
        for(int i = 0; i < n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array = ");
        int  arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to find in the array = ");
        int key = sc.nextInt();

        searchingKey ob = new searchingKey();

        System.out.println("The element found at index = "+ob.searchKey(arr,n,key));
    }
}
