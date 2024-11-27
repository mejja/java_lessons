public class Persons {

    // Enum for Gender
    public enum Gender {
        MALE, FEMALE, OTHER
    }

    // Enum for City
    public enum City {
        NAIROBI, LAGOS, KIGALI, CAIRO, JOHANNESBURG
    }

    // Person Bean Class
    public static class Person {
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

        // Getters and Setters
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
    }
}
