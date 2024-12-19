public class TestClass{
	public Object get0bject(){
		Object obj = new String("aaaaa"); //1
		Object objArr[] = new Object[1]; //2
		objArr [0] = obj; //3
		obj = null;//4
		objArr [0] = null;//5
		return obj;//6
	}
}
//.When is the object at line //1 eligible for garbage collection?