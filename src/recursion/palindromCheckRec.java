package recursion;
import java.util.*;
public class palindromCheckRec {
    public static boolean isPalindrom(char arr[],int start,int end){

        if(start == end) return true;
        
        if(arr[start] != arr[end])  return false;

        if(start < end){
            return isPalindrom(arr,start + 1,end - 1);
        }
        return true;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr[] = str.toCharArray();
        if(isPalindrom(arr,0,arr.length - 1))
            System.out.println("Palindrom String. ");
        else
            System.out.println("Not a Palindrom String. ");
    }
}
