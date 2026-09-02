import java.util.Comparator;

public class weightComparator implements Comparator<student>{

    @Override
    public int compare(student o1, student o2) {
        return o1.weight-o2.weight;
    }
}
//Lemda function
// Collection.sort(students,(o1,o2)->o1.weight -o2.weight);