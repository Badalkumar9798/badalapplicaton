package java_public_class;

class student {
    int rollNo;
    String studentsName;
}
public class main {
    public static void main(String[] args) {
        student obj1 = new student();
        obj1.rollNo=1 ;
        obj1.studentsName=". Rohan";

        System.out.print(obj1.rollNo);
        System.out.println(obj1.studentsName);

        student obj2 = new student();
        obj2.rollNo=2;
        obj2.studentsName=". Rahul";
        System.out.print(obj2.rollNo);
        System.out.println(obj2.studentsName);
    }

}
