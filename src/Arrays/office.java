package Arrays;

public class office {
    public static void main(String[] args) {
        // System.out.print(isEven(0));
        int arr[] = { 9, 8, 10, 8, 10, 19, 18 };
        int ans = lastIndex(arr, 8);
        System.out.println(ans);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int lastIndex(int arr[], int k) {
        int store = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                store = i;
        }
        return store;
    }

    public static int lastIndex(int arr[], int k, int start) {
        if (start == arr.length)
            return start;
        if (arr[start] == k) {
            int store = start;
        }
        return lastIndex(arr, k, start + 1);
    }
}
