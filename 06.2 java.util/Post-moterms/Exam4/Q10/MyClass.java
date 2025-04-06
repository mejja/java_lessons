import java.io .*;

class MyClass{
	public static void main(String[] args) throws IOException {
		NumberStore ns = new NumberStore();
		System.out.println("The number: " +ns.getInteger());
		ns.setInteger(10);
		System.out.println("The number: " + ns.getInteger());
	}
}
class NumberStore {
int i =5;
public void setInteger(Integer x){
	System.out.println("The number passed in is: " +x);
	i = x;
}
public int getInteger( ){
	return i;
	}
}