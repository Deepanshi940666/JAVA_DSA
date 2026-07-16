public class Constructor {
    public static void main(String[] args) {
        Student s1= new Student("Deepanshi",108);
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}

class Student{
    public String name;
    public int roll;

    public Student(String name, int roll) {  //constructor(parameterised)
        System.out.println("Heyy your Constructor is called....");
        this.name=name;
        this.roll=roll;
    } 
    
}
