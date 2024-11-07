import java.util.*;

public class ArrayListTest11{
    public static void main(String[] args) {

        List<String> myNameList = new ArrayList<String>(); 
        // Adding elements to object of List interface Custom inputs 
        myNameList.add(0, "Major"); 
        myNameList.add(1, "Kiema");
        myNameList.add(2, "Mbandi"); 

        List<String> dadNameList = new ArrayList<String>(); 
        dadNameList.add(0, "Kiema");
        dadNameList.add(1, "Mbandi");

        // Check if myNameList and dadNameList are lists using instanceOf
        //instanceOf can't compare incompatible type i.e testing not
        boolean check1 = myNameList instanceof List;
        boolean check1b = dadNameList instanceof List;
        System.out.println(check1);  // true
        System.out.println(check1b); // true
        
        // Confirm lists are not arrays using getClass()
        boolean isMyNameListArray = myNameList.getClass().isArray();
        boolean isDadNameListArray = dadNameList.getClass().isArray();
        System.out.println(isMyNameListArray);  // false
        System.out.println(isDadNameListArray); // false

        // Convert Lists to arrays
        String[] myNameArray = myNameList.toArray(new String[myNameList.size()]); 
        String[] dadNameArray = dadNameList.toArray(new String[dadNameList.size()]); 

        // Check if myNameArray and dadNameArray are arrays
        boolean check2 = myNameArray.getClass().isArray();
        boolean check2b = dadNameArray.getClass().isArray();
        System.out.println(check2);  // true
        System.out.println(check2b); // true

        //Confirm arrays are not lists using getClass()
        boolean isMyNameArrayList = myNameArray.getClass().isAssignableFrom(List.class);
        boolean isDadNameArrayList = dadNameArray.getClass().isAssignableFrom(List.class);
        System.out.println(isMyNameArrayList);  // false
        System.out.println(isDadNameArrayList); // false
    }
}
