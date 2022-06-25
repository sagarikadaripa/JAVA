/* input  = PEPcodinG
   output = pepCODINg
 */
/* LOGIC  = 'P' - 'A' = 'p' - 'a' i.e., the difference between capital P and chapital A is same as the difference of small p and small a
            if the character is in upper case 
                lowerCaseCharacter = UpperCaseCharacter - 'A' + 'a'
*/
package Strings;
import java.util.*;
public class invertUpperToLower {
    public static void main(String[] args){

        StringBuilder sb  = new StringBuilder("PEPcodinG");
        for(int i = 0;i < sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uc = (char)(ch - 'a' + 'A');
                sb.setCharAt(i,uc);
            }
            else{
                char lc = (char)(ch - 'A' + 'a');
                sb.setCharAt(i,lc);
            }
        }
        System.out.println(sb);
    }
}
