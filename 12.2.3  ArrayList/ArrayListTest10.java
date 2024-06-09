import java.util.*;

class ArrayListTest10 {
  public static void main(String[] args) {
    // create an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();

    // add elements to the ArrayList
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    System.out.println("ArrayList: " + numbers);

   // Creating object of ListIterator<String> using listIterator() method
    ListIterator<Integer> iterator = numbers.listIterator();
 
    // Printing the iterated value
    System.out.println("\nUsing ListIterator:\n");
      while (iterator.hasNext()) {
        System.out.println("Value is : "+ iterator.next());
            }

      }
  }
