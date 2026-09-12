public class SumOf_n_No {
    public static void Sum(int n, int m, int sum) {
        if(n==m){
            sum+=n;
            System.out.println(sum);
            return;
        }

        sum=sum+n;
        Sum(n+1, m, sum);
    }
    public static void main(String[] args) {
        int n=1;
        int m=5;
        int sum=0;
        Sum(n, m, sum);
        // System.out.println(Sum(n, m, sum));
    }
}
