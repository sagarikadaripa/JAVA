package recursion;

public class Multiplication {
    public static void main(String[] args) {
        int n = 0, m = 10;
        System.out.println(multiply(n, m));
        System.out.println(10204 / 10);
    }

    private static int multiply(int n, int m) {

        if (n > m) {
            if (m < 1)
                return m;
            return n + multiply(n, m - 1);
        } else {
            if (n < 1)
                return n;
            return m + multiply(n - 1, m);
        }

    }
}
