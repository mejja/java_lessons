import java.util.*;

public class Main{
   // Main method to test the Money class
    public static void main(String[] args) {
      List<Money> moneyList = new ArrayList<>();  

        moneyList.add(new Money(Currency.USD, 10.00));
        moneyList.add(new Money(Currency.EUR, 50.00));
        moneyList.add(new Money(Currency.ZAR, 200.00));
        moneyList.add(new Money(Currency.GBP, 5.00));
        moneyList.add(new Money(Currency.USD, 25.00));
        moneyList.add(new Money(Currency.EUR, 15.00));
        moneyList.add(new Money(Currency.ZAR, 100.00));
        moneyList.add(new Money(Currency.GBP, 20.00));
        moneyList.add(new Money(Currency.USD, 1.00));
        moneyList.add(new Money(Currency.EUR, 30.00));

        //print unSorted lists
        System.out.println("Unsorted List");
        System.out.println(moneyList);

        //sorting
        Collections.sort(moneyList);

        //print Sorted lists
        System.out.println("Sorted List");
        System.out.println(moneyList);

        }
}