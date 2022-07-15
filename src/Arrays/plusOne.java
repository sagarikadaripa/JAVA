package Arrays;
import java.util.*;
public class plusOne {
    public static int[] plusOnee(int[] digits) {
        
        for(int i = digits.length - 1;i >= 0 ;i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            if(digits[i] == 9 && i != 0){
                  digits[i] = 0;
            }
            if(digits[i] == 9 && i == 0){
                digits[i] = 0;
                break;
            }    
        }
        int[] newArr=new int[digits.length+1];
        for(int i=newArr.length-1;i>=1;i--) {
            newArr[i]=digits[i-1];
        }
	
	    newArr[0]=1;
	    return newArr;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int resArr[] = plusOnee(arr);
        for(int i = 0 ;i < resArr.length;i++){
            System.out.println("ans = "+resArr[i]);
        }
        
    }
}
