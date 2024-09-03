public class QuestionX3{
	public static void main(String[] args){
		int one =2, two=1;
		switch(one - two)
		{
			case -1:
				++one;
				++two;
				break;
			case 2:
				--one;
				--two;
				break;
				default:
					one +=2;
					two +=1;
					break;
		}
		System.out.println(one+ "\n" + two);
		
			
			
		}
		
		}
	
