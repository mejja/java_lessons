public class BiggestNumber {
    
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 2;
        int num3 = 10;

        int biggest = findBiggest(num1, num2, num3);
        System.out.println("The largest number among the three is: " + biggest );
    }

    public static int findBiggest(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        }else if (b > c){
            return b;
        }else{
            return c;
        }
    }
}
