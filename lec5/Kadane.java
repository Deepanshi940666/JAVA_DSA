// package lec5;

public class Kadane {
    public static void Algo(int a[]) {
        int max=a[0];
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={5,3,-10,9,-2};
        int a[]={5,-2,1,6,-3,4};
        Algo(arr);
        Algo(a);
    }
}
