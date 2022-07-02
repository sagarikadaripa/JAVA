package Integers;
import java.util.*;
public class gcdAndLcm {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number = ");
        int a = sc.nextInt();
        System.out.print("enter the second number = ");
        int b = sc.nextInt();
        int on1 = a;
        int on2 =b;
        //approach 1
        // int max = Math.max(a,b);
        // int gcd = 1;
        // for(int i = 2;i < max;i++){
        //     if(a%i == 0 && b%i == 0){
        //         gcd = i;
        //     }
        // }
        // System.out.println("GCD = " +gcd);
        //Approach 2
        while(a % b != 0){                  // step1 - 24 % 36 = 12, step2 - 12 % 24 = 0
            int rem = a % b;
            a = b;
            b = rem;   
        }
        int gcd = b;
        System.out.println("GCD = "+gcd);
        int lcm = (on1 * on2) / gcd;
        System.out.println("LCM = "+lcm);

    }
}
