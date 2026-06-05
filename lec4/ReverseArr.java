//time complexity is O(n)
public class ReverseArr {
    public static int reverse(int arr[]) {
        int l=0;
        int r=arr.length-1;
        int temp;
       while(l<=r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
