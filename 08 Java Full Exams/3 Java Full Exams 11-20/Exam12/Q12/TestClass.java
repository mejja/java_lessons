import java.io.IOException;   // Import for IOException
import java.sql.SQLException; // Import for SQLException

public class TestClass{
	public static void main(String args[]){
	}
	void ml() throws Exception{
			try{
				throw new IOException();  
			}
			catch (IOException e){
				System.out.println("IOException thrown");
				throw new SQLException();
			}
			catch(SQLException e) {
				throw new InstantiationException();
			 }

			finally{
				throw new CloneNotSupportedException("CloneNotSupportedException thrown"); // this is not a RuntimeException.
			}
		}
}