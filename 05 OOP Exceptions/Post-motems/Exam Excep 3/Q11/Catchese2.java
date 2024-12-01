package oop.catches;

public class Catchese2 {
	public static void main(String[] args) throws Exception {
		try{
			int i = 1;

			System.out.println("Step 1");
			System.out.println("Step 2");
			
			if(i>0){
				throw new Exception("Failure");
			}
			try{
				try{
				System.out.println("Step 3");
				}
				finally{
					System.out.println("Step 4");
				}
				System.out.println("Step 5");
			}
			finally{
				System.out.println("Step 6");
			}
			System.out.println("Step 7");
		}
	}
}