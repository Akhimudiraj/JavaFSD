import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		//	step1 : load the driver ... this will identify the which database u are using it
			Class.forName("com.mysql.cj.jdbc.Driver");//this have inbuild logic to connect/ hit to database
			System.out.println("driver loaded");
			
		//step2 : create the connection ? where is ur db? where us username? password
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/jdbc","root","200318");
			System.out.println("connection created");
			
		//step3 : create the stmt  :this is just to pass what we can do on database /insert/update/delete
			Statement stmt = con.createStatement();
			
		//step4 : execute the query
			stmt.execute("insert into Employee values(111,'bahubali',27,1000000,'Developer')");
			
		//step 5 : close the connection
			con.close();
			stmt.close();
			
			System.out.println("data inserted successfully");
			
			
		}catch (Exception e){
			System.out.println(e);
			
		}

	}

}
