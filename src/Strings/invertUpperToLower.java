package Strings;
import java.util.*;
public class invertUpperToLower {
    public static void main(String[] args){

        char str[] = new char("PEPcodinG");
        for(int i = 0;i < sb.length();i++){
            if(Character.isUpperCase(sb.charAt(i)))
            {
                sb.setCharAt(i,sb.toLowerCase());
            }
            else{
                sb.setCharAt(i,sb.toUpperCase());
            }
        }
        System.out.println(sb);
    }
}
