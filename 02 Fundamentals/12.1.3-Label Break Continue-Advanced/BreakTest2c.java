public class BreakTest2c {
    public static void main(String[] args) {  
        int i = 0;

        outer:do{
            System.out.println("outer:"+i);
            int j = 0;//Reset j for each iteration of outer loop
            inner:do{
                System.out.println(" inner:"+j);
                if(i == 2){
                 break inner;
                }
                int k = 0;//Reset j for each iteration of outer loop
                innest:do{
                    System.out.println("  innest:"+k);
                    k++;
                }while(k<3); 
              j++;//Update j at the end of each iteration of the outer loop       	
            }while(j<3); 
            i++; //Update i at the end of each iteration of the outer loop       	
        }while(i<3);
    }
}