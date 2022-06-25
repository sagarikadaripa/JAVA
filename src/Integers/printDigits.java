package Integers;
import java.util.*;
public class printDigits {
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        //Approach 1
        int num = sc.nextInt();
        int digits = 0;
        int temp = num;
        while(temp != 0){
            temp = temp / 10;
            digits ++;
        }
        int divisor = (int)Math.pow(10, digits - 1);
        while(divisor != 0){
            int quo = num / divisor;
            System.out.println(quo);
            num = num % divisor;
            divisor = divisor / 10;
        }  
        //Approach 2
      /* *int n = sc.nextInt();
        String s = Integer.toString(n);
        for(int i = 0 ; i <s.length();i++){
            System.out.println(s.charAt(i));
        } */
        sc.close();
    }
}
