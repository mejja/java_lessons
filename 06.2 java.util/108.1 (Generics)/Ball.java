import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ball{
	@Override
	public String toString(){
		return "ball";
	}

	public static void main(String[] args){
		Map<Integer,Ball> ballMap = new HashMap<>();
		ballMap.put(1, new Ball());
		ballMap.put(2, new Ball());
		ballMap.put(3, new Ball());
		ballMap.put(4, new Ball());

		//Iterator
		 Iterator<Ball> iterator = ballMap.values().iterator();

		//print 
		while(iterator.hasNext()){
			Ball ball = iterator.next();
			System.out.println(ball.toString());
		}
	}
}