public class Main {

public static void main(String[] args) {
Super supa=new Sub();

System.out.println(supa.name(5));
}
}
class Super {
public Object name(Object num){
return 10;
}
}

class Sub extends Super{
public Integer name(Integer num){
return 5;
}
}