package Arrays;

import java.util.ArrayList;

public class PowerOfTwo {
    private static boolean checkIsPower(long n) {

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }

    private static int numberOfSubsequences(int N, ArrayList<Integer> A) {
        int countPowerOfTwo = 0;
        for (int i = 0; i < N; i++) {
            if (checkIsPower(A.get(i)))
                countPowerOfTwo++;
        }
        if (countPowerOfTwo % 2 == 0)
            return countPowerOfTwo * countPowerOfTwo - 1;
        return countPowerOfTwo * countPowerOfTwo - 2;
    }

    public static void main(String[] args) {
        System.out.println(checkIsPower(0));
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(6);
        A.add(2);
        A.add(4);
        A.add(8);
        int ans = numberOfSubsequences(5, A);
        // System.out.println(ans);
    }
}
