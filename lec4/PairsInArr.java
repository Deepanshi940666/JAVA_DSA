public class PairsInArr {
    public static int Pair(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
        return 0;
    }
    // public static int PairArr(int arr[]) {
    //     int l=0;
    //     int r=arr.length-1;
    //     for(int i=0;i<arr.length;i++){
    //         if(l<r){
    //            System.out.println(arr[l]+","+arr[r]);
    //            r--;
    //         }
    //         // }else{
    //             l=i;
    //             r=arr.length-1;
    //         // }
    //     }
    //     return 0;
    // }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Pair(arr);
        // PairArr(arr);
    }
}
