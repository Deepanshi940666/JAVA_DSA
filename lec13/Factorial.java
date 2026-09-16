public class Factorial {
     public static void Factorial(int n, int m, int fac) {
        if(n==m){
            fac*=n;
            System.out.println(fac);
            return;
        }
        if(n==0){
            System.out.println(1);
            return;
        }

       fac=n*fac;
       Factorial(n-1, m, fac);
    }
    public static void main(String[] args) {
        int n=0;
        int m=1;
        int fac=1;
        Factorial(n, m, fac);
        // System.out.println(Sum(n, m, sum));
    }
}
