package recursion;

public class QuickSortRec {
    public static void quickSort(int[] input) {
        quickSort(input, 0, input.length - 1);
    }

    private static void quickSort(int input[], int start, int end) {
        if (start >= end)
            return;
        int pivotIdx = pivot(input, start, end);
        quickSort(input, start, pivotIdx - 1);
        quickSort(input, pivotIdx + 1, end);
    }

    private static int pivot(int input[], int start, int end) {

        int pivot = input[start], countSmall = 0;
        for (int i = start + 1; i <= end; i++) {
            if (input[i] <= pivot)
                countSmall++;
        }
        int pivotIdx = countSmall + start;
        input[start] = input[pivotIdx];
        input[pivotIdx] = pivot;

        int i = start, j = end;
        while (i < j) {

            while (i <= end && input[i] <= pivot)
                i++;
            while (input[j] > pivot)
                j--;

            if (i <= j) {

                int x = input[i];
                input[i] = input[j];
                input[j] = x;
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 19, 10, 18, 5, 1, 61 };
        quickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
