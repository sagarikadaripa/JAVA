package recursion;
import java.util.Scanner;
public class sumRecursion {
    
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        summation(n,sum);
        sc.close();
    }
    public static void summation(int i,int sum) 
    {
        if(i < 0)
        {
            System.out.println(sum);
            return ;
        }
        summation(i - 1,i + sum);       
    }
}
