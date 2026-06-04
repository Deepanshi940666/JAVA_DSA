// package lec4;

import java.util.Arrays;

public class BinarySearch {
     public static int BS(int arr[],int key){
        int left=0;
        int right=arr.length-1;
        
        for(int i=0;i<arr.length;i++){
            int mid=(left+right)/2;
           if(key==arr[mid]){
                return mid;
           }else if(key>arr[mid]){
                left=mid+1;
           }else{
                right=mid-1;
           }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,5,8,3,2};
        int key=8;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println( BS(arr,key));
       
    }
}
