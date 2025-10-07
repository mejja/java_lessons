import java.io.*;
import java.util.*;

public class ArrayListTest8 {
    public static void main(String[] args) {

        //create an empty array myName with initial capacity as 5
        ArrayList<String> myName = new ArrayList<String>(5);

        //adding element to list using add() method
        myName.add("Major");
        myName.add("Kiema");
        myName.add("Mbandi");

        //prints all the elements available in the myName
        System.out.println("Printing myName:");
        for (String name : myName)
            System.out.println("Name is: " + name);

        //create an empty array myName with initial capacity as 3
        ArrayList<String> sisterName = new ArrayList<String>(3);

        //adding element to list using add() method
        sisterName.add("Amy");
        sisterName.add("Kiema");

        //prints all the elements available in the myName
        System.out.println("Printing sisterName:");
        for (String name : sisterName)
            System.out.println("Name is: " + name);

        // create an empty array list1 with initial capacity as 3
        ArrayList<String> brotherName =  new ArrayList<String>(3);
        // use add() method to add elements in the list
        brotherName.add("Chief");
        brotherName.add("Kitonga");
        brotherName.add("Kiema");
        // prints all the elements available in brotherName
        System.out.println("Printing list1:");
        for (String name : brotherName)
        System.out.println("Name is: " + name);

        // inserting all elements, sisterName & list1 will get printed after myname
        myName.addAll(sisterName);
        myName.addAll(2, brotherName); //brother's inserted b4 sister's

         System.out.println("Printing all the elements");
        // let us print all the elements available in myName
        for (String name : myName)
            System.out.println("Name is: " + name);
    }
}