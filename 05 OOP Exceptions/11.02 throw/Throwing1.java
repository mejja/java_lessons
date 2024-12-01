public class Throwing1 {
    public static void main(String[] args) throws Exception{
        int i = 5;
        if(i > 3){
            throw new Exception("Greater than 3");
        }
        System.out.println("Did not throw");
    }
}
