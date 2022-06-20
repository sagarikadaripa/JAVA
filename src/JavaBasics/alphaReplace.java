/* 
    Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    Example : 
    original = “eabcdef’ ; result = “iabcdif”
    Original = “xyz” ; result = “xyz”
 */


package JavaBasics;
import java.util.*;
public class alphaReplace {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String original = scanner.next();
        String result = "";
        for(int i = 0;i<original.length();i++){
            if(original.charAt(i) == 'e')
                result = result + 'i';
            else {
                result += original.charAt(i);
                }       
        }
        System.out.println(result);
        scanner.close();
    }
}
