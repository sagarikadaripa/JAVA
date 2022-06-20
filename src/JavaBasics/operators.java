package JavaBasics;
public class operators {
    public static void main(String[] args){
        //Post Increment
       /* int a = 10;
        int b = 0;
        b = a++; // b = 10 and a = 11 //first using the value of a ie 10 and then incrementing a
        System.out.println(a); // 11
        System.out.println(b); // 10 */ 

        //Pre Increment
        int a = 10;
        int b = 0;
        b = ++a; // first incrementing a to 11 and then using the value of a
        System.out.println(a); // 11
        System.out.println(b); // 11

    }
}
