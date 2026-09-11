public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1= new Calculator();
        System.out.println(c1.Sum(1, 1));
        System.out.println(c1.Sum(1, 1,1));
        System.out.println(c1.Sum(1,1.0));
        System.out.println(c1.Sum(1.0, 1.0));
    }
}

class  Calculator{
    int Sum(int a, int b){
        return a+b;
    }
    int Sum(int a, int b, int c){
        return a+b+c;
    }
    double Sum(int a, double b){
        return a+b;
    }
    double Sum(double a, double b){
        return a+b;
    }

}
