public class InsertionSort {
      public static void Sort(int arr[], int n) {

        for (int i = 1; i < n ; i++) {
            int tem =arr[i];
            int s=i-1;
                while(s>=0&& arr[s]>tem){
                    int val= arr[s+1];
                    arr[s+1]=arr[s];
                    arr[s]=val;
                    s--;
                }
            }
    
    for(int i=0; i<n;i++){
        System.out.println(arr[i]);
    }

}

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        int n = arr.length;

        Sort(arr, n);
    }

}