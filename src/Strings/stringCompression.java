/*  input = aaabbbccdeeeaf 
    output1 = abcdeaf
    output2 = a3b3c2de3af 
*/

package Strings;
import java.util.*;
public class stringCompression {
    
    public static String compression1(String str){

        char s = str.charAt(0);
        String start = "";
        start+=s;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if(curr != pre){
                start += curr;
            }
        }
        return start;
    }
    public static String compression2(String str){

        char s = str.charAt(0);
        String start = "";
        start+=s;
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i - 1);
            if( curr == pre){
                count ++;
            }
            else{
                if(count  > 1){
                    start+=count;
                    count = 1;
                }
                start+=curr;
            }
        }
        if(count  > 1){
            start+=count;
            count = 1;
        }
        return start;
    }
    public static void main(String[] args){  
            String str = compression1("aaabbbbccd");
            String str2 = compression2("aabbbcdddd");
            System.out.println(str2);
    }
}
