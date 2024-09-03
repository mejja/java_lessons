public class Question04 {

    public static void main(String[] args) {
        int year1 = 2000;
        int year2 = 2020;
        int year3 = 2023;

        System.out.println(compareYears(year1));
        System.out.println(compareYears(year2));
        System.out.println(compareYears(year3));
    }

    public static String compareYears(int year) {
        return (((year%4 == 0)&&(year%100 != 0)) || (year%400 == 0)? (year%400 == 0)? "First":"Second":"Third");
    }
}
