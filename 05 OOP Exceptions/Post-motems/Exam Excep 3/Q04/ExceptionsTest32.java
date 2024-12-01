package oop.exceptions3;

public class ExceptionsTest32 {
	public static void main(String[] args) throws MyException01, MyException02{
		int a = 6;
		if(a == 4){
			throw new MyException01("Error a == 4");
		}
		if(a == 5){
		throw new MyException02("Error a == 4");
		}
	System.out.println("Success");
	}
}

class MyException01 extends Exception{
	public MyException01(){}
	public MyException01(String msg){
		super(msg);
	}
}


class MyException02 extends RuntimeException{
	public MyException02(){}
	public MyException02(String msg){
		super (msg);
	}
}


