import java.util.TreeMap;

public class sortedBasedOnValue {
    public static void main(String[] args) {
         TreeMap <String,Integer> map = new TreeMap<>();
        map.put("Anjali",4);
        map.put("Prerna",1);
        map.put("Anu",7);
        map.put("Krish",2);
        map.put("Rahul",5);

        System.out.println("Sorted Hashmap based on key : "+map);
    }
}
