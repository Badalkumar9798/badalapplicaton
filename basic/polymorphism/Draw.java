package polymorphism;

class Shape {
    void draw(){
        System.out.println("drawing shape");
    }
}
class Circle extends Shape{
    void draw (){
        System.out.println("drawing Circle");
    }
}
class Rectangle extends Shape{
    void draw (){
        System.out.println("drawing rectangle ");
    }
}


public class Draw {
    public static void main(String[] args) {
        Shape s;
        s=new Circle();
        s.draw();

        s= new Rectangle();
        s.draw();
    }
}
