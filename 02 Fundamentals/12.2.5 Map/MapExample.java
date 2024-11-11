import java.util.*; 

public class MapExample { 
    public static void main(String args[]) { 
        // Creating an empty HashMap 
        Map<String, Integer> hm = new HashMap<String, Integer>(); 

        // Inserting pairs in above Map 
        // using put() method 
        hm.put("a", Integer.valueOf(100)); 
        hm.put("b", Integer.valueOf(200)); 
        hm.put("c", Integer.valueOf(300)); 
        hm.put("d", Integer.valueOf(400)); 

        // Traversing through Map using for-each loop 
        for (Map.Entry<String, Integer> me : hm.entrySet()) { 
            // Printing keys 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
    } 
}
