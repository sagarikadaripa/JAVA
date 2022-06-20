/* 
    Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    Example : 
    email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
    email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */


package JavaBasics;
import java.util.*;
public class subStrImpl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        String res = "";
        for(int i = 0;i < email.length();i++) {
            //approach1
            if(email.charAt(i) == '@')
            {
                res = res + email.substring(0,i);
            }
            /* Approach 2
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
            */
        }
        System.out.println(res);
    }
}
