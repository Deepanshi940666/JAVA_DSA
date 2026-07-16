public class CopyConstructor {
    
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Deeps";
        s1.roll=108;
        s1.house="blue";
        Student s2 =new Student(s1);
        s2.house= "red";
        //s1
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.house);

        //s2
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.house);
    }
}

class Student{
    public String name;
    public int roll;
    public String house;

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }

    public Student() { 
        System.out.println("Heyy your Constructor is called....");
    } 
    
}
