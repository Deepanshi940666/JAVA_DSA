public class Abstraction {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c=new Cat();
        d.eat();
        c.eat();
        System.out.println(d.color);
        System.out.println(c.color);
        d.ChangeColor();
        c.ChangeColor();
        System.out.println(d.color);
        System.out.println(c.color);
        
    }
}

abstract  class Animal{
    String color;

    Animal(){
        color="black";
    }

    void sleep(){
        System.out.println("Animal sleeps");
    }

    abstract  void eat();
}

class Dog extends Animal{
    void ChangeColor(){
        color= "Brown";
    }
    void  eat(){
        System.out.println("Dog eats cookies");
    }
}

class Cat extends Animal{
    void ChangeColor(){
        color= "White";
    }
    void eat(){
        System.out.println("Cat drinks milk");
    }
}