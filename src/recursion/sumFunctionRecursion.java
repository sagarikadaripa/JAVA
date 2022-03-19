package recursion;
import java.util.Scanner;
public class sumFunctionRecursion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int summ =  sum(num);
        System.out.println(summ);
        sc.close();
    }
    public static int sum(int n)
    {
        if(n == 0)
            return 0;
        else
            return n + sum(n - 1);
    }
}