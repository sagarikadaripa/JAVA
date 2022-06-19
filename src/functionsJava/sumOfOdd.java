package functionsJava;
import java.util.*;
public class sumOfOdd {
    public static int sum(int num){

        int sum = 0;
        for(int i= 1;i<=num;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int summation = sum(num);
        System.out.println(summation);
    }
}
