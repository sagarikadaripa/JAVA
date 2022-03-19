package recursion;

import java.util.Scanner;
public class factorialRecursion {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println(factorial);
        sc.close();

    }
    public static int fact(int n)
    {
        if(n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
