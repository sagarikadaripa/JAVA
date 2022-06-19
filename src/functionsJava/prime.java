
package functionsJava;
import java.util.*;
public class prime {

    public static boolean isPrime(int num){

        if(num < 0){
            return false;
        }
        for(int i = 2;i <= num/2;i ++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPrime(num));
    }
}
