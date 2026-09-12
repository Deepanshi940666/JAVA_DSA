public class Codeforces_s2_D {
    public static void CheckPassword(int[] inp, int p, int l) {
       int i=0;
       while(i<l){
        if(inp[i]==p){
            System.out.println("Correct");
            return;
        }else{
            System.out.println("Wrong");
            i++;
        }
       }
    }
    public static void main(String[] args) {
        int inp[]={2200,1020,1999,1000,9999};
        int password=1999;
        int l= inp.length;
        CheckPassword(inp, password, l);
    }
}
