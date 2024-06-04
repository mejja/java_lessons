public class Question47{
	public static int operators (){
		int x1 = -4;
		int x2 = x1-- / --x1;//-4/-6 and x1=-6
		// since int division (4/6)=0 hence x2 =0

		int x3 = ++x2 * x1++ * --x2;//1*(-6)*0
		//  x2=0 & x3=0 

		if(x2-- > x3++){//0 > 0 hence condition is false
			//x2=-1 and x3=1
			--x3;//not executed as if condition is false
		}else{
			x1++;//x1  increment -5 to -4
			x2--;//x2 increment -1 to -2
		}
		return x1 / x2 * x3; //(-4)/(-2)*1= 2*1=2
	
	}

	public static void main(String[] args){
		System.out.println(operators());
	}
}