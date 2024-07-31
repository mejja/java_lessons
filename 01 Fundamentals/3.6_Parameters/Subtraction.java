public class Subtraction {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        
        minusAndPrint(num1, num2);
    }
    
    public static void minusAndPrint(int a, int b) {
        int minus = a - b ;
        System.out.println("The difference between " + a +" and " + b + " is: " + minus);
    }
}
