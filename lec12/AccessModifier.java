public class AccessModifier {
    public static void main(String[] args) {
        BackAccount acc1=new BackAccount();
        System.out.println(acc1.Username);
        acc1.setPassword(1234567);
        System.out.println(acc1.getPassword());
        // System.out.println(acc1.password);
    }
}

class BackAccount{
    public String Username="Deepanshi Gupta";
    private int password =12345;

    public int getPassword(){
        return password;
    }

    public void setPassword(int password) {
        this.password =password;
    }
    
}
