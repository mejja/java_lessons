class B extends A{

	//public static void sM1() { System.out.println("In sub static"); }//Line 1 

	public void sM1() { System.out.println("In sub non-static"); }//Line 2 
}
class A{
	public static void sM1() { System.out.println("In base static"); }
}

//Which of the following statements are true?