public class RecursivePower {
    public static long RP(int n, long x) {
        if(n==0){
                // System.out.println(ans);
                return 1;
        }

        long ans= RP(n/2, x);

        if(n%2==0){
            return ans*x;
            // RP(n-1,  x);
        }
        else{
            return ans*x*x;
            // RP(n-1, x, ans);
        }
    }
    public static void main(String[] args) {
        int n=4;
        int x=3;
        int ans=1;
        System.out.println(RP(n,x));
    }
}
