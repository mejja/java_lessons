public class Division {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        
        devideAndPrint(num1, num2);
    }
    
    public static void devideAndPrint(int a, int b) {
        int quotient = a / b ;
        System.out.println("The quotient of the Division between " + a +" and " + b + " is: " + quotient);
    }
}