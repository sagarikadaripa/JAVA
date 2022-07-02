package Integers;
import java.util.*;
public class primeFactorization {

    public static boolean isPrime(int n){

        for(int i = 2;i <= n/2;i++) {
            if(n%i == 0){return false;}
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        for(int div = 2;div * div <= num;div++){
            if(isPrime(div)){
                while(num % div == 0){
                    num = num / div;
                    System.out.println(div);
                }
            }
        }
        if(num != 1){
            System.out.println(num);
        }
        sc.close();
    }
}
