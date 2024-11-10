import java.util.*;

public class VectorTest1i {
    public static void main(String[] args) {

        Vector<String> phrase = new Vector<>();
        
        phrase.add("I");
        phrase.add("am");
        phrase.add("learning");
        phrase.add("Java");
        phrase.add("with");
        phrase.add("OpenLearn");

        System.out.println("Vector Phrase"+ phrase); 
        
        Iterator value =phrase.iterator();

        System.out.println("The iterator values are: "); 
        while(value.hasNext()){
            System.out.println(value.next());
        }       

    }        
}
