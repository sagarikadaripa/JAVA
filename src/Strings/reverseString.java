package Strings;
import java.util.*;
public class reverseString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Approach 1
       /*  String sb = scanner.next(); 
        String finalStr = "";
        for(int  i = sb.length() - 1;i >= 0;i --){
         finalStr = finalStr +sb.charAt(i);
        }
        System.out.println(finalStr);
        scanner.close(); */
        //Approach 2 using String Builder
        StringBuilder sb = new StringBuilder("Aman");
        for(int i  = 0; i <sb.length() / 2;i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char fronChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, fronChar);
        }
        System.out.println(sb);
    }
}
