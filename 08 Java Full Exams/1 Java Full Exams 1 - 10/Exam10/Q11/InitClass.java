public class InitClass {
    public static void main(String args[]) {
        InitClass obj = new InitClass(5);
    }
    
    int m;                   // Instance variable (default value: 0)
    static int il = 5;      // Static variable initialized to 5
    static int i2;          // Static variable (default value: 0)
    int j = 100;            // Instance variable initialized to 100
    int x;                  // Instance variable (default value: 0)

    // Constructor
    public InitClass(int m) {
        System.out.println(il + " " + i2 + " " + x + " " + j + " " + m);
    }

    // Instance Initializer
    { 
        j = 30; 
        i2 = 40; 
    } 

    // Static Initializer
    static { 
        il++; 
    }
}



