package polymorphism;

class Animal {
    void sound(){
        System.out.println("Animal makes sound ");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat meows ");
    }
}

class test {
    public static void main(String[] args) {
        Animal a;
        a=new dog();
        a.sound();

        a = new cat();
        a.sound();
    }
}
