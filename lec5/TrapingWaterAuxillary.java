
public class TrapingWaterAuxillary {

    public static void TW(int a[]) {
        int maxL=0;
        int maxR=a[a.length-1];
        int LM[]=new int[a.length];
        int RM[]=new int[a.length];
        int str=0;
        for(int i=0;i<a.length;i++){
            // max=a[0];
            if(a[i]>maxL){
                maxL=a[i];
                LM[i]=maxL;
            }
            else{
                LM[i]=maxL;
            }
            // System.out.print(LM[i]+" ");
        }
        // System.out.println("");
        for(int i=a.length-1;i>=0;i--){
            // max=0;
            if(a[i]>maxR){
                maxR=a[i];
                RM[i]=maxR;
            }
            else{
                RM[i]=maxR;
            }
           
        }
        for(int i=0; i<a.length;i++){
            int min = Math.min(LM[i], RM[i]);
            str+=min-a[i];
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int arr[] = {4, 4, 4, 4, 4};
        TW(arr);
    }
}
