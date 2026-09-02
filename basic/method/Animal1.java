package method;

class Animal1 {
    String color;
    int age;

    void intObj (String c , int a){
        color = c;
        age = a;

    }
    void display(){
        System.out.println(color +" " + age);
}
public static void main(String[] args) {
    Animal1 buzo = new Animal1();
    Animal1 buzo1 = new Animal1();
    buzo.intObj("black",10);
    buzo1.intObj("blue",52);

    buzo.display();
    buzo1.display();
}
}