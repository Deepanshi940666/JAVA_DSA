public class SelectionSort {

    public static void Sort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {

            int smallIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[smallIndex]) {
                    smallIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int n = arr.length;

        Sort(arr, n);
    }
}