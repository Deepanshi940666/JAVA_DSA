

public class ASS_Arr2 {

    public static void rotate(int nums[], int pt,int t) {
        int n = nums.length;
        int help[] = new int[pt];

        for (int i = 0; i < pt; i++) {
            help[i] = nums[i];
        }

        for (int i = pt; i < n; i++) {
            nums[i - pt] = nums[i];
        }

        for (int i = 0; i < pt; i++) {
            nums[n - pt + i] = help[i];
        }
    }
    public static void rotate1(int nums[], int pt,int t) {
        int l=0;
        int r=pt-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }

        int left=pt;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

        int arrLeft=0;
        int arrRight=nums.length-1;
        while(arrLeft<arrRight){
            int temp=nums[arrLeft];
            nums[arrLeft]=nums[arrRight];
            nums[arrRight]=temp;
            arrLeft++;
            arrRight--;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==t){
               System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int pt = 3;
        int t=2;
        rotate1(nums, pt,t);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
