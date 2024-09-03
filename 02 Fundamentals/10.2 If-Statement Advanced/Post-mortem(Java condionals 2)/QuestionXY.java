public class QuestionXY{
	public static void main(String[] args){
		int one=2, two=3, five=4;
		switch(one + five - two)
		{
			case 0: case 2: case 4:
				++one;
				five +=two;
				break;
			case 1: case 3: case 5:
				--one;
				five += two;
				break;
				default:
					one += two;
				break;
		}
		System.out.println(one + "\n" +two + "\n" + five);
		}
	
	}
