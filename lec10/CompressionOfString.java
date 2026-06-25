public class CompressionOfString {
    public static void CS(String str) {
        int count =1; 
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                sb.append(str.charAt(i));
                sb.append(count);
               
                count=1;
            }
             
        }
        sb.append(str.charAt(str.length() - 1));
        sb.append(count);
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str = "aaabbbbccaa";
        CS(str);
    }
}
