package Arrays;
import java.util.*;
public class Prime {

    public static boolean isPrime(int n){
        if(n == 1) return false;
        if (n == 2) return true;
        for(int i = 2; i < n; i++){

            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nth = scanner.nextInt();
        int count = 0;
        int i = 1;
        while(count != nth){
            i++;
            if(isPrime(i)){
                count++;
            }   
        }
        System.out.println(i);
    }
}
