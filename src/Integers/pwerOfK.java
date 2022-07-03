/* 
    num = 16, k = 2
    2^4 = 16 = num
 
 */


package Integers;
import java.util.*;
public class pwerOfK {
    
    public static boolean check(int n,int k){

        boolean flag = false;
        while(n > 0){
            int digit = n % k;

            if(digit > 1)
                flag = false;
            if(digit == 1){
                flag = true;
            }
            n = n / k;
        }
        return flag;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k = ");
        int k = sc.nextInt();
        pwerOfK ob = new pwerOfK();
        System.out.println("result is = "+ob.check(n, k));
        sc.close();
    }
}
