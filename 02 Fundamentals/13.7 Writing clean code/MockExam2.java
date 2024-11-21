public class MockExam2 {
	public static void main(String[] args){

		
    	int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};

        int n = 0;
        //looping over shoe sizes and outputing on screen
        System.out.println(" ");
        System.out.println("PRINTING SHOE SIZES FREQUENCIES");
        System.out.print("Shoe  No: ");
        while(n < shoesize.length){
            System.out.print(" ");
            System.out.print(shoesize[n] +" ");
            
        n++;
        }


    	int j = 0;
        //looping over shirts sizes
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRINTING EVEN NO OCCURRENCES AS SHIRT SIZES ");
        System.out.print("Shirt  No: ");
    	while(j < shoesize.length){
    	 	int shirt = shoesize[j];
    	 	int pants = shoesize[j]%2;
           
    	 	switch(pants){
    	 		case 0:
                System.out.print(" ");
    	 		System.out.print(shirt);
    	 		break;
    	 	}
    	 j++;
    	}	

        int t = 0;
        //looping over socks sizes
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRINTING SOCKS SIZES(shoesize % 11) ");
        System.out.print("Sock  No: ");
    	while(t < shoesize.length){
    	 	int sock = shoesize[t];
    	 	int shoe = shoesize[t]%11;

    	 	switch(shoe){
    	 		case 0:
                System.out.print(" ");
    	 		System.out.print(sock);
    	 		break;
    	 	}
    	 t++;
    	 }
    	 		
        int s = 0;
        //looping over shoe sizes after increment them by 1
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRINTING SHOE SIZES + 1:");
        System.out.print("Shoe  No: ");
        while(s < shoesize.length){
        	System.out.print(shoesize[s] +1);
        	s++;
        	System.out.print(" ");
        }

    	int k = 0;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRINTING EVEN SHOE ((SIZES + 1)%2)");
        System.out.print("Shoe  No: ");
    	while(k < shoesize.length){
    	   	int me = shoesize[k] + 1;
    	   	int you = me%2;

    	   	switch(you){
    	   	case 0:
    	   	System.out.print(me);
            System.out.print(" ");
    	   	break;
    	   }
    	k++;
    	}
    	   	
    	int y = 0;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("PRINTING SHIRT ((SIZES + 1) % 11):");
        System.out.print("Shirt  No: ");
    	while(y < shoesize.length){	
    	    int us = shoesize[y] + 1;
    	   	int we = us%11;

    	   	switch(we){
    	   	case 0:
    	   	System.out.print(us);
            System.out.print(" ");
    	   	break;
    	   	}
    	y++;
    	}
        System.out.println(" ");
	}		
}
