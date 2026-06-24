//Lexicographic way means char by sky value
public class LargestString {
    public static void main(String[] args) {
        String a="mango";
        String b="apple";
        String c="orange";
        if(a.compareTo(b)>0 && a.compareTo(c)>0){
            System.out.println(a+" is long");
        }
        else if(b.compareTo(a)>0 && b.compareTo(c)>0){
            System.out.println(b+" is long");
        }
        else if(c.compareTo(b)>0 && c.compareTo(a)>0){
            System.out.println(c+" is long");
        }
    }
}
