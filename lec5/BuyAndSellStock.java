public class BuyAndSellStock {
    public static int BuySell(int arr[]) {
      int max=0;
      int buy;
      int profit;
      for(int i=0;i<arr.length;i++){
         buy=arr[i];
         for(int j=i+1;j<arr.length;j++){
            profit= arr[j]-buy;
            if(profit>max){
                max=profit;
            }
         }
      }
      return max;
    }
    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
       System.out.println(BuySell(arr)); 
    }
}


//   boolean buy=false;
//         int max=0;
//         int indx=0;
//         int profit=0;
//         for(int i=0;i<arr.length;i++){
//             for (int j = i+1; j < arr.length-1; j++) {
//                 buy=false;
//                 max=arr[i];
//                 if(arr[i]>arr[j]){
//                     buy=false;
//                 }else if(arr[i]<arr[j]){
//                     buy=true;
//                     indx= arr[i];
//                     if(arr[j]>max){
//                         max=arr[j];
//                     }
//                 }
//             }
//             if(buy==true){
//              profit= max - indx;
//             }
//         }
//         return profit;