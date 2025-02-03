public class Question29 {
    public static void main(String[] args) {
        int i = 10;
        if (i == 10.5){
            System.out.println("01");
            continue;//compilation error

            if (i == 10){
            System.out.println("02");
            break;//compilation error
        }
        }
        else {
            System.out.println("02");
          
            }
    }
}
