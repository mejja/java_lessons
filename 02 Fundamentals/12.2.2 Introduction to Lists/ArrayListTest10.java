import java.util.*;

public class ArrayListTest10{
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        // Adding elements to object of List interface Custom inputs
        names.add(0, "Major");
        names.add(1, "Mbandi");
        names.add(2, "Amy");
        names.add(3, "Kiema");

        ListIterator<String> itr=names.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }

        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }
    }
}
