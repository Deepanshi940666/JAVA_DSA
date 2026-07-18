public class CopyConstructor {
    
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Deeps";
        s1.roll=108;
        s1.house="blue";
        s1.marks[0]=70;
        s1.marks[1]=84;
        s1.marks[2]=69;
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
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

        s1.marks[2]=76;
        System.out.println("s1 "+s1.marks[2]);
        System.out.println("s2 "+s2.marks[2]);
    }
}

class Student{
    public String name;
    public int roll;
    public String house;
    public int marks[];

    Student(Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks= s1.marks;
    }

    public Student() { 
        marks= new int[3];
        System.out.println("Heyy your Constructor is called....");
    } 
    
}
