package JavaPatterns;
import java.util.*;

public class arrow {
    public static void main(String[] args){

        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n/2;
        int st = 1;
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= spaces;j++){
                if(i != (n/2 + 1)){
                    System.out.print(" ");   //printing spaces
                }   
                else{
                    System.out.print("*"); //printing star in the middle row
                }     
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*"); //printing
            }
            if(i <= n/2){
                st ++;
            }
            else{
                st --;
            }
            System.out.println();
        }   
    }
}
