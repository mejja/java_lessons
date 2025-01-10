public class PrimitiveToDouble{
	public static void main(String[]  args){
		double doublePrimitive = 1234.50;

		Double doubbleObject = Double.valueOf(doublePrimitive);

		System.out.println("The primitive double is:" + doublePrimitive);
		System.out.println("The Double Object is: "+ doubbleObject);

	}
}