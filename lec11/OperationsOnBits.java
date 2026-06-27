public class OperationsOnBits {
    public static int  getid(int n, int i) {
        if((n&(1<<i))!=0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(getid(10, 2));
        
    }
}
