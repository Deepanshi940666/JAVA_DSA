// package lec7;

public class ASS_Arr1 {
    public static boolean  Distinct(int nums[]) {
        int Count=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    Count++;
                }
                if(Count==2){
                    return true;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,1};
        System.out.println(Distinct(nums));
    }
}
