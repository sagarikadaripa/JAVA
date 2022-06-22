package Arrays;
import java .util.*;
class pair{
    long first, second;
    public pair(long first,long second){
        this.first = first;
        this.second = second;
    }
}
public class maxAndMin {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scanner.nextInt();
        }
        //pair ob = new pair(0,0);
        //approach 1 after sorting the array the minimun is in the first index i.e. 0 and the maximun is the last index i.e., n-1
    /*  Arrays.sort(arr);
        ob.first = arr[0];
        ob.second = arr[n-1]; 
        System.out.println("MIN = " + ob.first);
        System.out.println("MAX = " + ob.second); */
        long min= arr[0], max= arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} if (arr[i] < min) {
				min = arr[i];
			}
		}
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
        scanner.close();
    }
}
