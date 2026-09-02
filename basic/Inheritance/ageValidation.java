package Inheritance;

class person {
    private int age ;

    public void setAge(int age) {
        if (age >=18) {
            this.age = age;
        }else {
            System.out.println("Invalid age !! setting default age = 18");
            this.age = 18;
        }
    }
    public int getAge(){
        return age;
    }
}

public class ageValidation {
    public static void main(String[] args) {

        person p = new person();

        p.setAge(15);
        System.out.println("Age " + p.getAge());

        p.setAge(25);
        System.out.println("Age " + p.getAge());
    }
}
