public class TestClass {
	public static void main(String[] args) throws Exception {
		Data d = new Data(1, 1);
		//add code here
		d.x +=1;
		d.y +=1;
		d.getData();
	}
}

class Data {
	int x = 0, y = 0;
	public Data(int x, int y) {
		this.x = x; this. y = y;
	}
	public void getData(){
		System.out.println(x);
		System.out.println(x);
	}
}

//Which of the following options when applied individually will change the Data object currently
//referred to by the variable d to contain 2, 2 as values for its data fields?