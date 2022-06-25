/* if there are 6 digits in the number then all te numbers between 1 to 6 should be present in any order
     for exmaple lets say there are 6 digits in the number then output can be 612435 or 623514 ... so on

input  =            6 2 3 4 1 5
indexes of input =  6 5 4 3 2 1 
ouput =             6 1 3 4 5 2
indexes of output = 6 5 4 3 2 1 

reversing the indexes of the input = output
6th = 6 * 10^(6 - 1) = 600000
5th = 1 * 10^(5 - 1) =  10000
4th = 3 * 10^(4 - 1) =   3000
3th = 4 * 10^(3 - 1) =    400
2nd = 5 * 10^(2 - 1) =     50
1st = 2 * 10^(1 - 1) =  +   2
                    -------------------------
       OUTPUT  =       613452
*/



package Integers;
import java.util.*;
public class checkNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int inverseNum = 0;
        int pos = 1; //original position
        while(num != 0){

            int digit =  num % 10;  //fetching digit from the end
            int invertedDigit = pos;
            int invertedPos = digit;

            inverseNum = inverseNum + invertedDigit * (int)Math.pow(10,invertedPos - 1);

            num = num / 10;
            pos ++;
        }
        System.out.println("Inverted Number = "+inverseNum);
        sc.close();
    }
}
