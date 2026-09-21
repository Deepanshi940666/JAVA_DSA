public class PowerInLogn {
    public static void main(String[] args) {
        int x=2;
        int n=3;
        int ans=1;
        int output;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                ans=ans*x;
            }
            output=ans*ans;
        }
        else{
             for(int i=0;i<n/2;i++){
                ans=ans*x;
            }
            output=ans*ans*x;
        }

        System.out.println(output);
    }
}
