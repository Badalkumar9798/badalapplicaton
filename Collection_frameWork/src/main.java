import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Integer[] arr = {5,4,6,8,7,3};
        Arrays.sort(arr,new reverseCmp());
        for(int a : arr){
            System.out.print(a+" ");
        }
//        List<student> students = new ArrayList<>();
//
//        students.add(new student(19, "vipul", 98));
//        students.add(new student(18, "vishal", 68));
//        students.add(new student(22, "balram", 65));
//        students.add(new student(19, "gautam", 55));
//
//        System.out.println("Before Sorting -> ");
//
//        for (student s : students) {
//            System.out.println(s);
//        }
//
//        Collections.sort(students, new weightComparator());
//
//        System.out.println("\nAfter Sorting -> ");
//
//        for (student s : students) {
//            System.out.println(s);
//        }
    }
}
