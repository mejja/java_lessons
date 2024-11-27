import java.util.*;

public class LambdaSortMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        
        // Add persons with different ages
        people.add(new Person(new GregorianCalendar(1995, Calendar.MAY, 21).getTime(), "Major", "Mbandi"));
        people.add(new Person(new GregorianCalendar(1985, Calendar.FEBRUARY, 20).getTime(), "Stanely", "kang'ethe"));
        people.add(new Person(new GregorianCalendar(2000, Calendar.MARCH, 5).getTime(), "Mwazandile", "Johnson"));
        people.add(new Person(new GregorianCalendar(1975, Calendar.APRIL, 10).getTime(), "Stanely", "Macharia"));

        // Sort the list by age (natural ordering)
        Collections.sort(people);

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

