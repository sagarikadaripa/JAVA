/* Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
 */

package JavaBasics;
import java.util.*;
public class combinedLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //size of the array from user
        int size = scanner.nextInt();
        String arr[] = new String[size];
        int length = 0;
        //elements of the array from user and length
        for(int i = 0;i < arr.length;i++) {
            arr[i] = scanner.next();
            length = length + arr[i].length();
        }
        System.out.println(length);
        scanner.close();
    }
}
