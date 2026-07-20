public class ShallowAndDeepCopy {
        public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Shreya";
        s1.roll=123;
        System.out.println(s1.name);
        System.out.println(s1.roll);
        s1.marks[0]=20;
        s1.marks[1]=40;
        s1.marks[2]=39;
        for(int i=0;i<3;i++){
            System.out.println(s1.marks[i]);
        }

        Student s2=new  Student(s1);
        s2.name="Aashi";
        s2.roll=111;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    int marks[];

    public Student() {
        marks= new int[3];   
    }

    // public Student(Student s1){  //shallow copy
    //     marks=new int[3];
    //     this.marks=s1.marks;
    // }

    public  Student(Student s1){ //Deep Copy
        marks=new int[3];
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
 
    
}
