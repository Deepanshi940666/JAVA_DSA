public class MethodOverriding {
    public static void main(String[] args) {
        Animal a1= new Animal();
        Cat c1= new Cat();
        a1.eat();
        c1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat drinks milk...");
    }
}