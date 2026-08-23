public class Inheritance {
    public static void main(String[] args) {
        Thar t1= new Thar();
        t1.color="Black";
        System.out.println(t1.color);
        t1.Acc();
        t1.Break();
        t1.BackDoor();
    }
}

//Parent,Base class
class Car{
    String color;
    void Break(){
        System.out.println("Car stop");
    }
    void Acc(){
        System.out.println("Car is running");
    }
}

//Child, sub, Derived class
class Thar extends Car{
    void BackDoor(){
        System.out.println("Not have BackDoors");
    }
}
