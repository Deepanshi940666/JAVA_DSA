// package lec4;

public class LargestNo {
     public static int LN(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                // System.out.println(i);
                max=arr[i];
               
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,3,2};
        // int key=3;
        System.out.println( LN(arr));
       
    }
}
