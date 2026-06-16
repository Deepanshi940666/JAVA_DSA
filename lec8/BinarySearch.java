
public class BinarySearch {

    public static void main(String[] args) {
        int arr[][] = {{2, 4, 9},{1, 3, 7},{5, 6, 8}};
        int t=7;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==t){
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
