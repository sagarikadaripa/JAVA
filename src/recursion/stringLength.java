package recursion;
import java.util.*;
public class stringLength {
    public static int length(char str[],int i){
        if(str[i] == '\0')   return 0;
        return (1 +  length(str,i + 1));

    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            str+='\0';
            char arr[] =  str.toCharArray();
            int length = length(arr,0);
            System.out.println("The length = "+length);
    }
}
