/* print the table of a number using functions */
package functionsJava;
import java.util.*;
public class table {

    public static void tableNum(int num){

        int i = 0;
        System.out.println("The table of "+num+" is");
        for(i = 1; i <= 10; i++){
            System.out.println(num +" * " + i +" = "+ num*i);
        }
    }
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        tableNum(num);
    }
}
