//Write a program to create hash map in java
//
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1," Name");
        map.put(2," B.Tech");
        map.put(3," CSE");

        System.out.println(map);

        //write a program for linkedHashMap
        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<>();
        map2.put(4,"hii");
        map2.put(5,"hello");

        System.out.println(map2);

        //write a program to add 5 value and remove 4 one and update 2 value
         TreeMap<Integer,String> tree = new TreeMap<>();
         tree.put(1,"One");
         tree.put(2,"Two");
         tree.put(3,"Three");
         tree.put(4,"Four");
         tree.put(5,"Five");

        System.out.println("Original :- "+ tree);
        System.out.println("Before use remove :- "+tree);
        tree.remove(4);
        System.out.println("after removing :- "+tree);
        System.out.println("After updation : ");
        tree.put(2,"Updated Two");
        System.out.println("After the Updation : "+tree);

    }
}




