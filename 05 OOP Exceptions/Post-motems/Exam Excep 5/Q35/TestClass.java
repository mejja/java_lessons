public class TestClass{
public float parseF loat(String s){
float f =0.0f;

try{
f=Float.valueOf(s).floatValue();
return f ;

catch(NumberFormatException nfe){
System.out.println("Invalid input "+ s);
f=Float.NaN;
return f;

finally { System.out.println("finally"); }
return f;
}