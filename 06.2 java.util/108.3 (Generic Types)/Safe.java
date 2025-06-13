public interface Safe<T extends Money>{
	int lockIn(T target);
	T getFromSafe(int key);	
}