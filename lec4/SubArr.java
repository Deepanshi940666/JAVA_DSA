public class SubArr {
     public static int Sub(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println("");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Sub(arr);
    }
}


