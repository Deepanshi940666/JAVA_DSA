// package lec4;

public class LinearSearch {
    public static int LS(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                // System.out.println(i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,3,2};
        int key=3;
        System.out.println( LS(arr,key));
       
    }
}
