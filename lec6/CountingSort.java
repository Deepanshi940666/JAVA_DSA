import java.util.Arrays;

public class CountingSort {
    public static void Sort(int arr[], int n) {
        int max = Arrays.stream(arr).max().getAsInt();

        int helper[] = new int[max + 1];

        // Count frequency
        for (int i = 0; i < n; i++) {
            helper[arr[i]]++;
            // System.out.println(helper[arr[i]]++);
        }

        // Print frequencies
        for (int i = 0; i < helper.length; i++) {
            System.out.println(i+" => "+helper[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,7,4,3,4,3,1};

        Sort(arr, arr.length);
    }
}