public class Question11{
	public static void main(String[] args){
	int i=2, j=4;
	//code will print nothing as no case found matching 14 and since no default case nothing will print.
	switch(i+j*3)//14
	{
	case 1:
		case 2:
			System.out.print("1 and 2");
			break;
			case 3:
				System.out.print("2 to 10");
				break;
	}
	}
}