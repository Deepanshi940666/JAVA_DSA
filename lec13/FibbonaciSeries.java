public class FibbonaciSeries {
    public static void Fibbo(int a, int b, int n) {
        int sum;
        if(n==0){
            return;
        }
        sum=a+b;
        a=b;
        b=sum;
        System.out.println(sum);
        Fibbo(a, b, n-1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=9;
        System.out.println(a);
        System.out.println(b);
        Fibbo(a, b, n-2);
    }
}

