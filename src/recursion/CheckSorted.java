package recursion;

public class CheckSorted {
    public static boolean isSorted(int arr[]) {
        if (arr.length == 1)
            return true;
        if (arr[0] > arr[1])
            return false;
        int smallArray[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        boolean sorted = isSorted(smallArray);
        return sorted;
    }

    public static boolean isSorted(int arr[], int start) {
        if (arr.length - 1 == start)
            return true;
        if (arr[start] > arr[start + 1])
            return false;

        return isSorted(arr, start + 1);
    }

    public static int sum(int input[]) {
        return sum(input, 0);
    }

    private static int sum(int input[], int startIndex) {
        if (startIndex == input.length)
            return 0;
        int ans = input[startIndex] + sum(input, startIndex + 1);
        return ans;
    }

    public static int lastIndex(int input[], int x) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return lastIndex(input, x, 0);
    }

    private static int lastIndex(int input[], int x, int startIndex) {

        if (startIndex == input.length) {
            return -1;
        }
        int smallAns = lastIndex(input, x, startIndex + 1);
        if (smallAns != -1) {
            return smallAns;
        }
        if (input[startIndex] == x) {
            return startIndex;
        } else {
            return -1;
        }
    }

    private static int firstIndex(int arr[], int x, int start) {

        if (arr.length == start)
            return -1;
        if (arr[start] == x)
            return start;
        return firstIndex(arr, x, start + 1);
    }

    public static void main(String[] args) {

        int arr[] = { 61, 12, 63, 61, 10, 2, 77, 81, 61, 77 };
        System.out.println(firstIndex(arr, 77, 0));

    }
}
