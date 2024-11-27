import java.util.*;

public class Person {
    private Date dateOfBirth;
    private int age;
    private String name;
    private String surname;
    private int dayToNextBirthDay;

    // Constructor
    public Person(Date dateOfBirth, String name, String surname) {
        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.surname = surname;
        this.age = calculateAge(dateOfBirth);
        this.dayToNextBirthDay = calculateDaysToNextBirthday(dateOfBirth);
    }

    // Calculate age from dateOfBirth
    	int calculateAge(Date dateOfBirth) {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        
        int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    // Calculate days until the next birthday
    public int calculateDaysToNextBirthday(Date dateOfBirth) {
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dateOfBirth);
        Calendar today = Calendar.getInstance();
        
        // Set the next birthday date
        Calendar nextBirthday = Calendar.getInstance();
        nextBirthday.set(Calendar.YEAR, today.get(Calendar.YEAR));
        nextBirthday.set(Calendar.MONTH, birthDate.get(Calendar.MONTH));
        nextBirthday.set(Calendar.DAY_OF_MONTH, birthDate.get(Calendar.DAY_OF_MONTH));
        
        // If the birthday has already passed this year, set it to the next year
        if (nextBirthday.before(today)) {
            nextBirthday.add(Calendar.YEAR, 1);
        }
        
        // Calculate the number of days between today and the next birthday
        long millisBetween = nextBirthday.getTimeInMillis() - today.getTimeInMillis();
        return (int) (millisBetween / (1000 * 60 * 60 * 24));
    }

    // Getters and Setters
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        this.age = calculateAge(dateOfBirth); // Recalculate age if DOB is set/changed
        this.dayToNextBirthDay = calculateDaysToNextBirthday(dateOfBirth); // Recalculate days to next birthday
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public int getDayToNextBirthDay() {
        return dayToNextBirthDay;
    }

    public void setDayToNextBirthDay(int dayToNextBirthDay) {
        this.dayToNextBirthDay = dayToNextBirthDay;
    }

    // Override hashCode
    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    // Override toString
    @Override
    public String toString() {
        return String.format("Person{name='%s', surname='%s', dateOfBirth=%s, age=%d, daysToNextBirthday=%d}",
                             name, surname, dateOfBirth, age, dayToNextBirthDay);
    }
}
