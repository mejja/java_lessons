public class Challenge2Main {
    static String operand1, operator, operand2;
    static double result = 0.0;

    public static void main(String[] args) {
        MenuPrinter.printMenu();

        while (true) {
            operand1 = Prompter.prompt("Enter first Operand");
            boolean isNumValid = NumberValidator.opIsValid(operand1);
            if (!isNumValid) {
                System.out.println("Enter a valid operand");
            } else {
                break; // Exit loop if operand1 is valid
            }
        }

        operator = Prompter.prompt("Enter the operator");

        while (true) {
            operand2 = Prompter.prompt("Enter second Operand");
            boolean isNumValid2 = NumberValidator.opIsValid(operand2);
            if (!isNumValid2) {
                System.out.println("Enter a valid operand");
            } else {
                break; // Exit loop if operand2 is valid
            }
        }

        // Parsing entered numbers to double
        double op1 = Double.parseDouble(operand1);
        double op2 = Double.parseDouble(operand2);

        // Perform operation
        operation(op1, op2);
    }

    public static void operation(double op1, double op2) {
        // Addition
        if (operator.equals("+")) {
            result = Addition.add(op1, op2);
            MenuPrinter.addResult(op1, operator, op2, result);
        }
        // Subtraction
        else if (operator.equals("-")) {
            result = Subtraction.subtract(op1, op2);
            MenuPrinter.subResult(op1, operator, op2, result);
        }
        // Multiplication
        else if (operator.equals("*")) {
            result = Multiplication.multiply(op1, op2);
            MenuPrinter.multResult(op1, operator, op2, result);
        }
        // Division
        else if (operator.equals("/")) {
            result = Division.divide(op1, op2);
            MenuPrinter.divResult(op1, operator, op2, result);
        }
        // Modulus
        else if (operator.equals("%")) {
            result = Modulus.modulus(op1, op2);
            MenuPrinter.modResult(op1, operator, op2, result);
        } else {
            System.out.println("Enter a valid operator!!");
        }
    }
}
