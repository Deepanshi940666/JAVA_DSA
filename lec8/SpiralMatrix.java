public class SpiralMatrix {
    public static void spiral(int arr[][], int n, int m) {
        int top=0;
        int down=n-1;
        int left=0;
        int right=m-1;
        while(top<=down&&left<=right){
            for(int i=top;i<=down;i++){
                System.out.println(arr[top][i]);
            }
            for(int j=left+1;j<=right;j++){
                System.out.println(arr[j][right]);
            }
            for(int k=down-1;k>=top;k--){
                System.out.println(arr[down][k]);
            }
            for(int l=right-1;l>left;l--){
                System.out.println(arr[l][left]);
            }
            top++;
            down--;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=arr.length;
        int m=arr[0].length;
        spiral(arr, n, m);
    }
}
