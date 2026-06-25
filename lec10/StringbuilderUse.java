public class StringbuilderUse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        StringBuilder strB=new StringBuilder("Tony");
        System.out.println(strB.toString());
        for(char ch='a' ; ch<='z';ch++){
            sb.append(ch+" ");
        }
        System.out.println(sb);
    }
}
