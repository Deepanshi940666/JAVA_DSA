

public class PalindromeString {
    public static void main(String[] args) {
      String str="racescar";
        int l=0, r=str.length()-1;
        boolean flag=true;
      while(l<=r){
        if(str.charAt(l)!=str.charAt(r)){
          flag=false;
        }
         l++;
         r--;
          
        }
      
      if(flag){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not");
      }
    }
}
