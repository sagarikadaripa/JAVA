package recursion;
import java.util.*;
public class gcd {

    public static int gcdR(int a,int b){

        if(b == 0) return a;
        return gcdR(b,a%b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd g = new gcd();
        System.out.println("GCD = "+g.gcdR(a,b));
    }
}
