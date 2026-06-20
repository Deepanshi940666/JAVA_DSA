
public class DiagonalSum {
    // public static int Primary(int arr[][], int n, int m) {
    //     int sum=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(i==j){
    //                 sum+=arr[i][j];
    //             }
    //         }
    //     }
    //     // System.out.println(sum);
    //     return sum;
    // }
    // public static int Secondary(int arr[][], int n, int m) {
    //     int sum=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=m-1;j>=0;j--){
    //             if(i+j==n-1){
    //                 sum+=arr[i][j];
    //             }
    //         }
    //     }
    //     // System.out.println(sum);
    //     return sum;
    // }

    // public static void DiagonalValSum(int arr[][], int n, int m) {
    //    int PD= Primary(arr, n, m);
    //    int SD=Secondary(arr, n, m);
    //    int sum=0;
    //    if(n%2==0){
    //       sum+=PD+SD-arr[n/2][m/2];
    //    }
    //    else{
    //         sum+=PD+SD;
    //    }
    //    System.out.println(sum);
    // }
    public static void DS(int arr[][], int n, int m) {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += arr[i][i];
            if (i != m - i - 1) {
                sum += arr[i][m - i - 1];
            }

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int arr1[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;
        // Primary(arr, n, m);
        // Secondary(arr, n, m);
        DS(arr, n, m);
        DS(arr1, 3, 3);
    }
}
