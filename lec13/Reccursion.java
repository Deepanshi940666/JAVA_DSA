// to print no 5 to 1 by recurision
public class Reccursion {
    public static void PrintNo(int n) {
        if(n==0){
            return;
        }
        System.out.print(n);
        PrintNo(n-1);
        
    }

    public static void Print1To5(int n) {
        if(n==6){
            return;
        }

        System.out.print(n);
        Print1To5(n+1);
    }

    public static void main(String[] args) {
        int n=5;
        PrintNo(n);
        System.out.println(" ");
        int a=1;
        Print1To5(a);
    }
}
