import java.util.*;

public class sortedBasedOnKey {
    public static void main(String[] args) {
        TreeMap <Integer,String> map = new TreeMap<>();
        map.put(3,"Anjali");
        map.put(6,"Prerna");
        map.put(1,"Anu");
        map.put(4,"Krish");

        System.out.println("Sorted Hashmap based on key : "+map);
    }
}
