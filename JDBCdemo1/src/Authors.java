import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Authors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/practice", "postgres",
					"postgres");
//	    Statement stmt = con.createStatement();
	  	Statement st = con.createStatement();
		    
	  	 boolean status =st.execute("create table employee(empid int, empname varchar(20), empphone text," + "empdepartment varchar(40), empemail varchar(30), emprole varchar(50));");
		   
		    st.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error");
		}


	}

}
