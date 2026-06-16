public class GreaterVal {
    public static void main(String[] args) {
         int arr[][] = {{2, 4, 9},{1, 3, 7},{5, 6, 8}};
         int max=arr[0][0];
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                   max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
