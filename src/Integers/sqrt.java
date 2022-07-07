package Integers;
import java.util.*;
public class sqrt {
    public static int sqrtt(int num){
        int res = 0;
        for(int i = 1;i <= num/2;i++){
            if(i * i == num) 
            {
                res = i;
            }
            else{
                if(i * i < num) res = i;
            }
        }
        return res;
    }
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sqrtt(num);
        System.out.println("ans = "+result);
        sc.close();
    }
}
