public class Power {
    public static int Pow(int x,int ans, int n) {
        if(x==0){
            // System.out.println(0);
            return 0;
        }
        if(n==0){
            // System.out.println(ans);
            return ans;
        }
        ans=ans*x;
        return Pow(x, ans, n-1);
    }
    public static void main(String[] args) {
        int x=3;
        int n=3;
        int ans=1;
        System.out.println(x*Pow(x,ans,n-1));
    }
}
