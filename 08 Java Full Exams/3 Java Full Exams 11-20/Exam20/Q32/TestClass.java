//In the following code, after which statement (earliest), the object
//originally held in s , may be garbage collected?

public class TestClass{ //1
	public static void main (String args[]){//2
		Student s = new Student("Vaishali", "930012");//3
		s.grade();//4
		System.out.println(s.getName());//5
		s = null;//6
		s = new Student("Vaishali", "930012");//7
		s.grade();//8
		System.out.println(s.getName());//9
		s = null;//10
	}
}

public class Student{
	private String name, rollNumber;
	public Student(String name, String rollNumber) {
		this.name = name;
		this. rollNumber = rollNumber;
	}
	//valid setter and getter for name and rollNumber follow

	public void grade() {
	}
}