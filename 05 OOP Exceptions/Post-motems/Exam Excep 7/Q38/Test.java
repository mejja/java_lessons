public class Test{
public static void main(String[] args){
int j= 1;
try{
int i=dolt()/(j=2);
} catch (Exception e){
System.out.println("j="+j);
}
}
public static int dolt() throws Exception { throw new Exception("FORGET"); }