import java.util.*;

public class Whiz{
	public static void main(String[] args){
		Aa = new A();

		I ia = new A();

		I i = new I()[];
		System.out.println(a.equals(ia) + "" + i.equals(ia));
	}
}

interface I{
	default boolean equals(Object O){
		return true;
	}
}

class A implements I{
	public boolean equals(Object O){
		return false;
	}
}

