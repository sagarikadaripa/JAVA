package Arrays;
import java.util.*;
public class countSort {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }


        int count_zero = 0, count_one = 0, count_two = 0;
        for(int i = 0;i < n;i++){
            if(a[i] == 0)
                count_zero++;
            else if(a[i] == 1)
                count_one++;
            else  
                count_two++;
        }
        for(int i = 0;i < count_zero; i++){
            System.out.print("0" + " ");
        }
        for(int i = 0;i < count_one; i++){
            System.out.print("1 ");
        }
        for(int i = 0;i < count_two; i++){
            System.out.print("2 ");
        }
    }
}
