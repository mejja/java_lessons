public class Throwing3 {
    public static void main(String[] args) throws Exception{
        int i = 3;
        if(i > 4){
            throw new Exception("Houston we have a problem");
        }
        System.out.println("Did not throw");
    }
}
