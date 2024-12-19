public class Sample implements IInt{
	public static void main(String[] args){
		Sample s = new Sample();
		int j = s.thevalue;//1
		int k = IInt.thevalue;//2
		int l = thevalue;//3
	}
}

