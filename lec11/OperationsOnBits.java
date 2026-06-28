public class OperationsOnBits {
    public static int  getith(int n, int i) {
        if((n&(1<<i))!=0){
            return 1;
        }else{
            return 0;
        }
    }
    public static int  setith(int n, int i) {
        return n|(1<<i);
    }
    public static int  clearith(int n, int i) {
        return n&(~(1<<i));
    }
    public static int updateith(int n, int i, int newBit) {
        n=clearith(n, i);
        return (n|(newBit<<i));
    }
    public static int clearFromith(int n, int i) {
        // n=clearith(n, i);
        return (n&((~0)<<i));
    }
    public static int clearrange(int n, int i,int j) {
        int a=((~0)<<j+1);
        int b=(1<<i)-1;
        return (n&((a|b)));
    }
    public static void main(String[] args) {
        System.out.println(getith(10, 2));
        System.out.println(setith(10, 2));
        System.out.println(clearith(10, 1));
        System.out.println(updateith(10, 2,1));
        System.out.println(clearFromith(15, 2));
        System.out.println(clearrange(15, 1,4));
    }
}
