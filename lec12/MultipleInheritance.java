public class MultipleInheritance {
    public static void main(String[] args) {
        Dog Tommy= new Dog();
        Tommy.eat();
        Tommy.color="White";
        System.out.println(Tommy.color);
        Tommy.legs=4;
        System.out.println(Tommy.legs);
        Tommy.Type="breed";
        System.out.println(Tommy.Type);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Can Eat");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String Type;
}
