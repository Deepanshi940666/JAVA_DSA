public class Encapsulation {
      public static void main(String[] args) {
        BankAccount acc1=new BankAccount();
        System.out.println(acc1.Username);
        acc1.setPassword(1234567);
        System.out.println(acc1.getPassword());
        acc1.setPassword(12345678);
        System.out.println(acc1.getPassword());
        
        // System.out.println(acc1.password);
    }  
}

class BankAccount{
    public String Username="Deepanshi Gupta";
    private int password =12345;

    public int getPassword(){
        return password;
    }

    public void setPassword(int password) {
        this.password =password;
    }
    
}