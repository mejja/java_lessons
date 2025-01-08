//using constructor Double(double value) though deprecated
public class DoubleTest2{
	public static void main(String[] args){
		double doublePrimitive=  123.45;
		Double doubleObject = new Double(doublePrimitive);

		System.out.println("The Double object value is:" + doubleObject);
	}
}