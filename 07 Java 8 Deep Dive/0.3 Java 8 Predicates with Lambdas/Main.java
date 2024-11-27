import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();

         // Adding sample Person objects with varying attributes
        people.add(new Person("Major", "Mbandi", 30, Gender.MALE, City.NAIROBI));
        people.add(new Person("Stanely", "Karanja", 55, Gender.MALE, City.LAGOS));
        people.add(new Person("Stanely", "Macharia", 40, Gender.MALE, City.KIGALI));
        people.add(new Person("Mzwandile", "Tutu", 51, Gender.MALE, City.CAIRO));
        people.add(new Person("Noxolo", "Kunene", 21, Gender.FEMALE, City.JOHANNESBURG));
        people.add(new Person("Winnie", "Mandela", 71, Gender.FEMALE, City.JOHANNESBURG));


        // Predicate to filter people older than 50
        Predicate<Person> isOver50 = person -> person.getAge() > 50;

        //Predicate to filter Males
        Predicate<Person> isFemale = person -> person.getGender() == Gender.FEMALE;


        // Filter the list of people
        List<Person> over50sAndFemale = people.stream()
                                              .filter((isOver50).and(isFemale))
                                              .collect(Collectors.toList());

        List<Person> females = people.stream()
                                    .filter(isFemale)
                                    .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Female & Over50 Peoples:");
        for (Person person : over50sAndFemale) {
            System.out.println(person);
        }
    }
}
// Define the Gender enum
enum Gender {
    MALE,
    FEMALE,
    OTHER
}

// Define the City enum
enum City {
    NAIROBI,
    LAGOS,
    KIGALI,
    CAIRO,
    JOHANNESBURG
}

// Define the Person class
class Person {
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private City city;

    // Constructor
    public Person(String name, String surname, int age, Gender gender, City city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", city=" + city +
                '}';
    }
}
