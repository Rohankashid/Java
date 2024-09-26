import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class exp11 {
    public static void main(String[] args) {
        HashMap <Integer,String> hashMap =new HashMap<>();

        hashMap.put(10, "Apple");
        hashMap.put(20, "Banana");
        hashMap.put(30, "Orange");
        hashMap.put(40, "Grapes");
        hashMap.put(50, "Mango");

        System.out.println("Hashmap (Unordered):"+hashMap);

        List<Map.Entry<Integer,String>> sortedEntries=new ArrayList<>(hashMap.entrySet());
        Collections.sort(sortedEntries,(entry1,entry2)->entry1.getKey().compareTo(entry2.getKey()));

        LinkedHashMap<Integer,String> linkedHashMap =new LinkedHashMap<>();

        for(Map.Entry<Integer,String> entry: sortedEntries){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("LinkedHashMap (insertion order maintained :)"+linkedHashMap);
    }
}
    