public class BreakTest2b {
    public static void main(String[] args) {  
        int i = 0;

        outer:while(i<3){
            System.out.println("outer:"+i);
            int j = 0;//Reset j for each iteration of outer loop
            inner:while(j<3){
                System.out.println(" inner:"+j);
                if(i == 2){
                 break inner;
                }
                int k = 0;//Reset j for each iteration of outer loop
                innest:while(k<3){
                    System.out.println("  innest:"+k);
                    k++;
                } 
              j++;//Update j at the end of each iteration of the outer loop       	
            } 
            i++; //Update i at the end of each iteration of the outer loop       	
        }
    }
}

