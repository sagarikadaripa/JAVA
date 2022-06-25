package Integers;
import java.util.*;
public class sumDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int sum = 0,digit;
        //int temp = num;
        while(num > 0){
            digit = num % 10; //finding the last digit
            sum = sum + digit; //adding the last digit to the sum
            num = num / 10; //removing the last digit
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
