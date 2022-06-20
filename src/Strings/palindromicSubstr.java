package Strings;
import java.util.*;
public class palindromicSubstr {

    //checking if the string is palindrome or not
    public static boolean isPalindrome(String str){
        int i = 0; //storing the first index of the string
        int j = str.length() - 1; //storing the last index of the string
        while(i <= j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if(ch1 != ch2 )
                return false;
            else{
                i++;
                j--;
            }     
        }
        return true;
    }
    //finding out the substring
    public static void subStr(String str){
        for(int i = 0;i < str.length();i++){
            for(int j = i + 1;j <= str.length();j++){
                String temp = str.substring(i,j);
                if(isPalindrome(temp) == true){
                    System.out.println(temp);
                }
            }
        }
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        subStr(str);
        scanner.close();     
    }
}
