public class CheckPowOf2 {
    public static boolean check(int n) {
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(check(16)); //true
        System.out.println(check(12)); //false
        System.out.println(check(7)); //false
    }
}
