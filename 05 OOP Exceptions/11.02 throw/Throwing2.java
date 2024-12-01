public class Throwing2 {
    public static void main(String[] args) throws Exception{
        int i = 3;
        if(i > 4){
            throw new Exception("Greater than 3");
        }
        System.out.println("Did not throw");
    }
}
