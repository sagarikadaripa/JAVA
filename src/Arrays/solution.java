package Arrays;
import java.util.*;
public class solution {
    public static boolean digits(int num){
        if (num == 1 || num == 7)
            return true;
        int temp = num;
        int sum = num;
        while(sum > 9){
            sum = 0;
            while(temp != 0){
                int digits = temp % 10;
                int sq = digits * digits;
                sum = sum + sq;
                temp = temp/10;
            }
            if(sum == 1)
                return true;
            temp = sum; //if sum is not equals to 1 then we are assigning the sum which we got to our num
        }
        if(sum == 7)  ///if num is 7 the its square is 49 and 49 will always have 1 after iterations
            return true;
        return false;
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean b = digits(num);
        System.out.println(b);
    }
}
