public class StairCaseSearch {
    public static void search(int arr[][],int key) {
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                System.out.println("("+row+","+col+")");
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Value do not exists");
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        search(arr,14);
    }
}
