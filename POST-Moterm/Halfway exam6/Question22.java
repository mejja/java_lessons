public class Question22{
	public static void main(String[] args){
	//valid primitive declarations in uppercase
	 Boolean a= true;
	 Byte b= 12;
	 Short s= 10;
	 char c = 'A';//can't start with lowercase
	 int i1 = 1_234;//can't start with lowercase
	 Long l= 1050l;//can start with uppercase but need embed l to value
	 Float f= 12.5f;
	 //Dash can used to seperate big number for visuals
	 //but the dash need to be between two integer otherwise compilation error
	 Double d= 19_8.12_3;//compiles
	 //illigal dashes declarations
	 Double d1= 19_.123;//dash after numeral isnt't allowed
	 Double d2= _19.123;//preeding numeral isnt't allowed
	 Double d3= 19._123;// dash before integer after decimal point isn't allowed
	 Double d3= 19.123_;// Trailing dash is not allowed	 
	}
}