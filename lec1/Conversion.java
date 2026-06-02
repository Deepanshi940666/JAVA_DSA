package lec1;

public class Conversion {
    
    public static void BinToDeci(int n){
        int base=1;
        int ans=0;
        int rem;
        while(n!=0){
         rem=n%10;
         n=n/10;
         ans= ans+(rem*base);
         base=base*2;
        }
      System.out.println(ans);
    }
    public static void DeciToBin(int n){
        int base=1;
        int ans=0;
        int rem;
        while(n!=0){
         rem=n%2;
         n=n/2;
         ans= ans+(rem*base);
         base=base*10;
        }
      System.out.println(ans);
    }
    public static void main(String[] args) {
        BinToDeci(1010);
        DeciToBin(10);
    }
}
