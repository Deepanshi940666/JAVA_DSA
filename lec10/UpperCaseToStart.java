public class UpperCaseToStart {
    public static void ToUpperCase(String str) {
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                 sb.append(str.charAt(i));
                 i++;
                // char cha=Character.toUpperCase(str.charAt(i+1));
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
            
        }
        System.out.println(sb);
        
    }
     public static void main(String[] args) {
       String str="hii this is deeps";
       ToUpperCase(str);
    }
}
