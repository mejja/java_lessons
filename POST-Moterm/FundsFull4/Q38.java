public class Q38{
	public static void main(String[] args){
		int array[] = {0,1,2,3,4};
		int key = 3;
		int pos;
		for(pos =0; pos<array.length; ++pos){
			if(array[pos]== key){
				break;
			}
		}

		System.out.print("Found " + key+"at " + pos);
	}
}