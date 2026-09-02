package polymorphism;

class Animals {
    void sound(){
        System.out.println("Animal sound");
    }
}

class Tiger extends Animals{
    void sound() {
        System.out.println("Tiger Roar ");
    }
}
class Chetha extends Animals{
    void sound(){
        System.out.println("Chetha meows ");
    }
}
class Cow extends Animals{
    void sound(){
        System.out.println("Cows moos");
    }
}

public class Animal_sound {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];

        animals[0] = new Tiger();
        animals[1] = new Chetha();
        animals[2] = new Cow();

        for(Animals a : animals ){
            a.sound();
        }
    }
}
