public class GenericMain{
	public static void main(String[] args){
		//5 instances of Banana
		Banana banana1 = new Banana("Banana 1");
		Banana banana2 = new Banana("Banana 2");
		Banana banana3 = new Banana("Banana 3");
		Banana banana4 = new Banana("Banana 4");
		Banana banana5 = new Banana("Banana 5");
		// Generic instance of SafeImpl 
		SafeImpl<Banana> safe = new SafeImpl<>();
		//Adding all 5 instances to the safe
		safe.lockIn(banana1); 
		safe.lockIn(banana2); 
		safe.lockIn(banana3); 
		safe.lockIn(banana4); 
		safe.lockIn(banana5); 

		//Print the contents of the safe
		 for (Banana banana : safe.getItems()) {
            System.out.println(banana);
        }

	}
}
