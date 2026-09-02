package polymorphism;

class addition {
    //method 1
    int add (int a , int b){
        return a+b;
    }
    //method 2(overloaded)
    int add (int a , int b, int c){
        return a+b+c;
    }
    //method 3 (different data type)
    double add (double a , double b){
        return a+b;
    }
}

public class calculator {
    public static void main(String[] args) {
        addition obj = new addition();

        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,8));
        System.out.println(obj.add(4.0,6.8));

    }
}
