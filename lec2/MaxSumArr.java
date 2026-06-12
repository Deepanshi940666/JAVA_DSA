// package lec2;

public class MaxSumArr {
    public static void main(String[] args) {
        int[] arr = {2,-3,1,9,-4,-6};
        int max=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(max<sum){
                    max=sum;
                }
            }
            sum=0;
        }
        System.out.println(max);
    }
}
