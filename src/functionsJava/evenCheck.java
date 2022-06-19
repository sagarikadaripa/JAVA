package functionsJava;
import java.util.*;
public class evenCheck {

    public static boolean isEven(int num){
        if(num%2 == 0) return true;
        else return false;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isEven(num));
    }
}
