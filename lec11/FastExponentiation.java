public class FastExponentiation {
    public static void main(String[] args) {
        int a=3, n=5,ans=1;
        while(n!=0){
            int LSB=n&1;
            if(LSB==1){
                ans=ans*a*LSB;
            }else{
                ans*=1;
            }
            a=a*a;
           n= n>>1 ;
        }
        System.out.println(ans);
    }
}
