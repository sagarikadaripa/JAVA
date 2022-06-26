
/* LOGIC = iterating backwards because if we iterate forward after removing the prime number we also need to update the indexes of the remaining elements */
package Integers;
import java.util.*;
public class RemovePrime {
    public static boolean isPrime(int num) {
        
        for(int i = 2;i<=num/2; i ++){
            if(num%i == 0) {return false;}
        }
        return true;
    }
    
    public static void removePrimeNum(ArrayList<Integer> arr){

        for(int i = arr.size() - 1; i>0;i--){ //iterating backwards because if we iterate forward after removing the prime number we also need to update the indexes of the remaining elements
            int num = arr.get(i);
            if(isPrime(num)){
                arr.remove(i);
            }
        }
    }
    
    public static void main(String[] args){
        int n = 5;
        ArrayList<Integer> arr = new ArrayList<Integer>(n); //Creating an Array List to store numbers or integers
        arr.add(24);
        arr.add(21);
        arr.add(17);
        arr.add(3);
        arr.add(26);
        removePrimeNum(arr);
        System.out.println(arr);
    }
}
