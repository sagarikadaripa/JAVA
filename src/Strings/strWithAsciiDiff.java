/*  input = abdgca
    output = a1b2d3g-4c-2a [b - a = 1, d - b = 2 ....]
*/
package Strings;
import java.util.*;
public class strWithAsciiDiff {
    
    public static String diff(String str){

        StringBuilder sb  = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i = 1;i < str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            int gap = curr - pre;
            sb.append(gap);
            sb.append(curr);         
        }
        return sb.toString();
    }
    public static void main(String[] args){

       String str = "abdgca";
       System.out.println(diff(str));
    }
}
