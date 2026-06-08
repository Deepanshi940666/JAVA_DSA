// package lec6;

public class BubbleSort {

    public static void Sort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int n = arr.length;
        Sort(arr, n);
    }
}
