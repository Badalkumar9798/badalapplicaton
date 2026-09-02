package Inheritance;

class student {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

public class SimpleGatterAndSetter {
    public static void main(String[] args) {
        student s = new student();
        s.setAge(18);
        System.out.println("Age :" + s.getAge());
    }
}
