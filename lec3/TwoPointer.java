
public class TwoPointer{
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        int t=6;
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]==t){
                System.out.println(i);
            }
            else if(arr[j]==t){
                System.out.println(j);
            }
            i++;
            j--;
        }
    
    }
}