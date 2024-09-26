

import java.util.Hashtable;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
       Map<String ,Integer>students=new Hashtable();

        students.put("rohan", 226);
        students.put("pratik", 456);
        students.put("raj", 346);
        students.put("sam", 54);
        System.out.println(students);
     for(String key:students.keySet()){
        System.out.println(key+":"+students.get(students));
     }

    }
}
