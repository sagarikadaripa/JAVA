package Integers;
import java.util.*;
public class countDigits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0;
        while(num > 0){
            num = num / 10;
            digits++;
        }
        System.out.println(digits);
        sc.close();
    }
}
