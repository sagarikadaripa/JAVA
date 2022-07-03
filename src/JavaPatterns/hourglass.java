package JavaPatterns;
import java.util.*;
public class hourglass {
    public static void main(String[] args){

        int n = 7;
        int spaces = 0;
        int st = n;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= spaces;j++){
                System.out.print(" "); // printing spaces
            }
            for(int j = 1;j <= st; j++){
                System.out.print("*"); // printing
            }
            if ( i <= n / 2)
            {
                st -= 2;
                spaces++;
            }
            else
            {
                st += 2;
                spaces--;
            }
            System.out.println();
        }
    }
}
