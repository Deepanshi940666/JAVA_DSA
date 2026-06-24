public class inBuildFunction {
    public static void main(String[] args) {
        String name="Deepanshi Gupta";
        //substring
        String Firstname= name.substring(0,9);
        System.out.println(Firstname);

        //compare
        String a="hey";
        String b="hii";
        if(a.compareTo(b)==0){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
