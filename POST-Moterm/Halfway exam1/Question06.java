public class Question06{
	public static void main(String args[]){
		int mask =0;
		int count = 0;
		if( ((5<7) || (++count < 10)) | mask++ <10) //mask is incremented to 1 after this expression
			mask = mask +1;//mask = 1+1=2
		if( (6>8) ^ false)//false ^ false = false  
			mask = mask + 10;//does not execute as if condition is false
		if( !(mask > 1) && ++count > 1) //2>1 is true but logical not result it to false
		//false && ++count >1 which result to false as first part is false due to && 
			//and ++count is not evaluated hence count remains 0
			mask = mask + 100;//not excuted as condition is false
		System.out.println(mask + " " + count);
	}
}