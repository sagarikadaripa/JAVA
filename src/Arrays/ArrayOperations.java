package Arrays;

import java.util.Scanner;

public class ArrayOperations {

    private static void insert(int arr[], int n, int position, int ele) {
        if (n == position) {
            return;
        }
        for (int i = n - 1; i >= position - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = ele;
    }

    private static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static boolean isPresent(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return true;
        }
        return false;
    }

    private static boolean present(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    private static void delete(int arr[],int ele){

        if(isPresent(arr, x)){
            int pos = present(arr,ele);
            for(int i = pos + 1; i < arr.l){

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        int arr[] = new int[size - 1];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < size - 1; i++) {
            arr[i] = i;
        }
        insert(arr, size, 2, 100);
        display(arr);
        scanner.close();
    }
}
