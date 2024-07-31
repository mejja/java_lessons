public class Addition {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 2;
        
        addAndPrint(num1, num2);
    }
    
    public static void addAndPrint(int a, int b) {
        int sum = a + b ;
        System.out.println("The Sum is of " + a +" and " + b + " is: " + sum);
    }
}
