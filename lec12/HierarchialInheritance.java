public class HierarchialInheritance{
    public static void main(String[] args) {
        Suzuki s1=new Suzuki();
        s1.run();
        s1.Stop();
        s1.use();
        System.out.println("--------------");
        Thar t1=new Thar();
        t1.run();
        t1.Stop();
        t1.size();
    }
}

class Car{
    void run(){
        System.out.println("Car is Running");
    }

    void Stop(){
        System.out.println("Car Stopped");
    }
}

class Thar extends Car{
    void size(){
        System.out.println("It has big size");
    }
}

class Suzuki extends Car{
    void use(){
        System.out.println("It is Family Friendly car");
    }
}