public class ShortestPath {
    public static void main(String[] args) {
        String D="WNEENESENNN";
        int l=0,r=0;
        for(int i=0; i<D.length();i++){
            if(D.charAt(i)=='W'){
                l--;
            }else if(D.charAt(i)=='S'){
                r--;
            }else if(D.charAt(i)=='N'){
                r++;
            }else{
                l++;
            }
        }

       double shortestDistance = Math.sqrt(l * l + r * r);
       System.out.println(shortestDistance);
    }
}
