package Strings;
import java.util.*;
public class spiltFun {
  public static void main(String[] args)  {
    String str = "Hi my name is Sagarika Daripa";
    String arr[] = str.split(" ");
    for(int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
  }
}
