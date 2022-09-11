package recursion;

public class PrintNameNtimes {
    private static void printName(int n) {
        // base condition
        if (n == 0)
            return;
        System.out.println("Saggy THE CODER");
        printName(n - 1);
    }

    private static void printNumbersOneToN(int n) {
        // base condition
        if (n == 0)
            return;
        printNumbersOneToN(n - 1);
        System.out.println(n);
    }

    private static void printNumbersNToOne(int n) {
        // base condition
        if (n == 0)
            return;
        System.out.println(n);
        printNumbersNToOne(n - 1);
    }

    private static int sumOneToN(int n) {
        if (n == 0)
            return 0;
        int sum = n + sumOneToN(n - 1);
        return sum;
    }

    private static void reverseArray(int arr[], int start, int end) {
        if (start >= end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    private static void reverseArray(int arr[], int start) {
        if (start > (arr.length - 1) / 2)
            return;
        int temp = arr[start];
        arr[start] = arr[arr.length - start - 1];
        arr[arr.length - start - 1] = temp;
        reverseArray(arr, start + 1);
    }

    public static void main(String[] args) {
        // printName(5);
        // printNumbersOneToN(5);
        // printNumbersNToOne(5);
        // int ans = sumOneToN(10);
        // System.out.println(ans);
        int arr[] = { 1, 2, 8, 4, 5, 9, 0 };
        reverseArray(arr, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
