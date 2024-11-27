public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable runner = ()->System.out.println("Major Mbandi");
        
        for(int i=0; i<9; i++){
            runner.run();
        } 
    }
}

