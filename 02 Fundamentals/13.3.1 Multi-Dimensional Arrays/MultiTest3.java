public class MultiTest3 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};
    	int groupindex=0;
        for(int [] group: lottogroups){
            System.out.println("Group :"+ groupindex++);//increment inside the print statement
            int valueIndex=0;
            for(int value: group){
                if(value%2==0){
                System.out.println("  Value "+valueIndex++ +" = "+ value);//increment inside the print statement
            } 
            //valueIndex++;       	
        }
        //groupindex++;
     }
    }
}