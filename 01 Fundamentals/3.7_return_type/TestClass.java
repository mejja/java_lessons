public class TestClass{

   // Constructing an instance method of a type String that returns a Pen.
    public String getPen(String pen){
        return pen;
    }
    public static void main(String[] args) {
      
        TestClass obj = new TestClass();
        //Assigning a return value of a type String to a name variable.
        String name = obj.getPen("Big");
       //Printing out the name of the pen.
        System.out.println(name);

    }
}
