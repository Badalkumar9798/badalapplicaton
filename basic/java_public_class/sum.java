package java_public_class;

class calc {
    public int add(int a,int b){
        return a+b;
    }
}

public class sum {
    public static void main(String[] args) {
        calc c = new calc();
        int result = c.add(5,3);
        System.out.println("sum = "+ result);
    }
}
