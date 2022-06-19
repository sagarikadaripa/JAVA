

package functionsJava;

import java.util.Scanner;

public class avg {
    public static double average(double n1,double n2,double n3){

        double avg = (n1 + n2 + n3)/3.0;
        return avg;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        System.out.println("the avg is = "+ average(num1, num2, num3));
    }
}
