class Test2Bean implements Comparable {
	Test2Bean(String name) {
		this.name= name;
	}
	String name;
	@Override
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Object o) {
	return 0;

	}
}