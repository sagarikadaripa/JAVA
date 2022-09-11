package Arrays;

import java.util.*;

public class abc {

    public static void main(String[] args) {

        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.print("Exception caught ");
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic Exception caught ");
        } finally {
            System.out.print("finally block");
        }

    }
}
