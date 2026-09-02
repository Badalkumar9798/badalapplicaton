import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//set is a collection that does not allow duplicate values and does not
//maintain insertion order

public class HashSetBasic {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        //try to insert duplicate value
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(30);
        hs.add(30);
        hs.add(40);
        System.out.println("try to print duplicate value :- "+hs);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //RetainAll -> its means when we retain set1 and set2 then it Return only same value
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        System.out.println("Original value from set 1 -> "+set1);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Original value from set 2 -> "+set2);

        //Ues of retain method
        set1.retainAll(set2);
        System.out.println("After the retain call -> "+set1);
        System.out.println(set2);

        //uses of linked hashset -> autopreserve
        //Also maintain insertion order
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(10);
        lhs.add(10);
        lhs.add(10);
        lhs.add(20);
        lhs.add(20);
        lhs.add(30);
        lhs.add(30);
        lhs.add(40);
        System.out.println("when use of linkedhashset -> "+lhs);

        //TREESET
        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(10);
        set3.add(30);
        set3.add(20);
        set3.add(40);
        System.out.println("Original treeSet values -> "+set3);
        //Important methods
        System.out.println("the first lower element -> "+ set3.first());
        System.out.println("the last higher value element -> "+set3.last());



    }
}



