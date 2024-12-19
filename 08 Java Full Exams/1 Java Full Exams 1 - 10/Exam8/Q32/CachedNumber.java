import java.util.HashMap;
import java.util.Map;

class CachedNumber {
	private static final Map<Integer, CachedNumber> CACHE = new HashMap<>();
	private int num;

	private CachedNumber(int num) { this.num = num; }

	public static CachedNumber of(int num) {
		return CACHE.computeIfAbsent(num, CachedNumber :: new);
	}


	@Override
	public String toString() {
		return num == 0 ? null : String.valueOf(num);
	}
	public void setCACHE(Integer i, CachedNumber o){
		this.CACHE.put(i, o);
	}
	public Map<Integer, CachedNumber> getCACHE(){
		return CACHE;
	}
	public static void main(String[] args) {
		CachedNumber first = CachedNumber.of(0);
		CachedNumber second = CachedNumber.of(2);
		first.setCACHE(1, first);
		second.setCACHE(2, second);
		Map<Integer, CachedNumber> CACHE = first.getCACHE();

		System.out.println(first + " " + second + " "+ CACHE.get(1));
	}
}