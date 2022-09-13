package recursion;

public class MergeSortRec {
    public static void mergeSort(int[] input) {

        if (input.length <= 1)
            return;

        int mid = input.length / 2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length - mid];

        for (int i = 0; i < mid; i++) {
            part1[i] = input[i];
        }
        int k = 0;
        for (int i = mid; i < input.length; i++) {
            part2[k] = input[i];
            k++;
        }

        mergeSort(part1);
        mergeSort(part2);
        mergeArrays(part1, part2, input);
    }

    private static void mergeArrays(int part1[], int part2[], int input[]) {
        int len1 = part1.length;
        int len2 = part2.length;
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (part1[i] < part2[j]) {
                input[k] = part1[i];
                i++;
                k++;
            } else {
                input[k] = part2[j];
                j++;
                k++;
            }
        }

        while (i < len1) {
            input[k] = part1[i];
            i++;
            k++;
        }
        while (j < len2) {
            input[k] = part2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 44, 92, 0, 191 };
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
