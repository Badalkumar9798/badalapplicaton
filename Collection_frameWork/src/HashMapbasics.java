import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashMapbasics {
    public static void main(String[] args) {
        Map<String,String> mapping = new HashMap<>();
        //insertion
        mapping.put("in","India");
        mapping.put("us","United State");
        mapping.put("en","England");
        System.out.println("short name -> "+mapping);
        //when key type is same and value is different -> update the value
        mapping.put("us","United State 2");
        System.out.println("updated -> "+mapping);

        //when you want to insert all the key and value of table 1 -> to table 2 then
        Map<String,String> table = new HashMap<>();
        table.put("br","Brazil");
        System.out.println("Before -> "+table);
        table.putAll(mapping);
        System.out.println("After -> "+table);

        //deletion
        table.remove("en");
        System.out.println("after remove ->"+table);
        System.out.println("the size of table -> "+table.size());

        //get the value by its key
        System.out.println("the value of br -> "+ table.get("br"));

        //if the key is not found then return the default value
        System.out.println(table.getOrDefault("us","NONE"));
        System.out.println(table.getOrDefault("usa","NONE"));

        //check the value  is present or not by using key . if present return True otherwise False
        System.out.println("check the key -> "+table.containsKey("in"));
        System.out.println("check the key -> "+table.containsKey("inc"));

        //check the value  is present or not by using value . if present return True otherwise False
        System.out.println("check the value -> "+ table.containsValue("India"));
        System.out.println("check the value -> "+ table.containsValue("inc"));

        System.out.println("Before replace -> "+table);
        //replace the value by using key
        table.replace("in","Indonesia");
        System.out.println("After replace -> "+table);

        //return the all collection of keys  by using keyset
        Set<String> keyset = table.keySet();
        System.out.println("print the all key -> "+keyset);

        //return the all collection of value by using values
        Collection<String> valueSet = table.values();
        System.out.println("print all the values -> "+valueSet);

        //get all the entries from map
        Set<Map.Entry<String,String>>entryset = table.entrySet();
        System.out.println("print all the entries -> "+entryset);

        //print all the entries by using for loop
        for (Map.Entry<String,String> entry : table.entrySet()) {
            System.out.println("Key-> "+ entry.getKey()+" , Value -> "+ entry.getValue());

        }








    }



}
