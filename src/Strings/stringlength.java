package Strings;
public class stringlength {
    public static void main(String[] args)  {

        String s = "sagarika";
        int c = 0;
        char arr[] = s.toCharArray();
        for(char i:arr){
            c++;
        }
        System.out.println("The length of the array = "+c);
    }
}
