public class Q05{
	public static void main(String[] args){
		int i=0;
		for(i=1; i<5; i++)continue;//iterate 4 times with jump making skipping to the next iteration
		for(i=0;;) break;//executes once and terminates
		for(;i<5?false:true;);//endless loop as no update condition
		for(;;);//loops forever as not condition present
	}
}