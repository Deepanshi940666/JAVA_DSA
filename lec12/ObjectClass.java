public class ObjectClass {
     public static void main(String[] args) {
        Student s1= new Student(); //object
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        s1.setName("Deeps");
        System.out.println(s1.name);
    }
}
class Student{   //class
    String name="Deepanshi";
    int rollno = 108;
    void setName(String newName){
        name= newName;
    }
    void setRollno(int newRoll){
        rollno=newRoll;
    }
}