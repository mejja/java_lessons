import java.util.*;

public class LambdaSortMain5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        
        // Add persons with different ages
        people.add(new Person(new GregorianCalendar(1995, Calendar.MAY, 21).getTime(), "Major", "Mbandi"));
        people.add(new Person(new GregorianCalendar(1985, Calendar.FEBRUARY, 20).getTime(), "Stanely", "Kang'ethe"));
        people.add(new Person(new GregorianCalendar(2000, Calendar.MARCH, 5).getTime(), "Mwazandile", "Johnson"));
        people.add(new Person(new GregorianCalendar(1975, Calendar.APRIL, 10).getTime(), "Stanely", "Macharia"));

         // Use Iterable.forEach with a lambda to update dayToNextBirthDay
        people.forEach(person -> person.setDayToNextBirthDay(person.calculateDaysToNextBirthday(person.getDateOfBirth())));

        // Sort the list by name (ascending) using a lambda comparator
        people.sort((p1, p2) -> p2.getSurname().compareTo(p1.getSurname()));

        // Print the sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}