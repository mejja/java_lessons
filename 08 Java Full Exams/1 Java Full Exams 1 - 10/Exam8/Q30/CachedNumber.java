import java.util.ArrayList;
import java.util.List;

class CachedNumber {
	private static final List<CachedNumber> CACHE = new ArrayList<>();
	private int num;

	private CachedNumber (int num) { this.num = num; }

	public static CachedNumber of(int num) {
		for (CachedNumber cachedNumber : CACHE) {
		if (cachedNumber.num == num) {
			return cachedNumber;
		}
	}
	CachedNumber newCachedNumber = new CachedNumber (num);
		CACHE.add(newCachedNumber);
		return newCachedNumber;
	}
	public List<CachedNumber> getCACHE(){
		return this. CACHE;
	}
	@Override
	public String toString() {
		return num == 0 ? null : String.valueOf(num);
	}
	public static void main(String[] args) {
		CachedNumber first = CachedNumber.of(0);
		CachedNumber second = CachedNumber.of(2);
		System.out.println(second.getCACHE().get(1));
	}
}