package Integers;
import java.util.*;
public class ReverseNum {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num > 0){
           int last = num % 10;
           System.out.println(last);
           num = num / 10;
        }
        sc.close();
    }
}
