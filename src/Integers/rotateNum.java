/*   num =  21435
     k = 2
     output  = 35214

     num = 21435
     k = -2
     output = 43521
*/

package Integers;
import java.util.*;
public class rotateNum {
    
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        System.out.print("Enter the value of k you want to rotate the number = ");
        int k = sc.nextInt();
        int temp = num;
        int digits = 0;
        while(temp != 0){
            temp = temp / 10;
            digits++;
        }
        k = k % digits;
        if(k < 0){
            k = k + digits;
        }
        int remainder = num % (int)(Math.pow(10,k));
        int dividend = num /(int) (Math.pow(10,k));
        int t = dividend;
        int c = 0;
        while(t > 0){
            t = t / 10;
            c++;    //counting the digits of the dividend
        }
        int new_num = remainder * (int)(Math.pow(10,c)) + dividend;
        System.out.println(new_num);
        sc.close();
    }
}
