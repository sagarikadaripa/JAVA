package JavaPatterns;
import java.util.*;
public class w {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n; j++){
                if(j == 1 || j == n ){
                    System.out.print("*");
                }
                else if(i > n/2 && (i == j || i + j == n + 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            scanner.close();
        }
    }
}
