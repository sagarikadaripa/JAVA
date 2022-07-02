package Integers;
import java.util.*;
public class allPrimePrint {
    public static boolean isPrime(int n){

        for(int i = 2;i <= n/2; i++){
            if(n % i == 0){return false;}
        }
        return true;
    }

    public ArrayList<Integer> primeList(int start,int end){

        ArrayList<Integer> primeNum = new ArrayList<Integer>();
        for(int i = start;i <= end;i++){
            if(isPrime(i)){
                primeNum.add(i);
            }
        }
        return primeNum;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the the starting number = ");
        int start = sc.nextInt();
        System.out.print("enter the the ending number = ");
        int end = sc.nextInt();
        allPrimePrint ob = new allPrimePrint();
        System.out.println(ob.primeList(start, end));

    }
}
