
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectbook {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

	      // variables
	      final String url = "jdbc:mysql:///mydatabase";
	      final String user = "root";
	      final String password = "2558";

	      // establish the connection
	      Connection con = DriverManager.getConnection(url, user, password);
	      // create JDBC statement object
	      Statement st = con.createStatement();

	      // prepare SQL query
	      String query = "SELECT * FROM book WHERE id = '1' OR bookname = 'Introduction to Java'";

	      // send and execute SQL query in Database software
	      ResultSet rs = st.executeQuery(query);

	      // process the ResultSet object
	      boolean flag = false;
	      while (rs.next()) {
	         flag = true;
	         System.out.println(rs.getInt(1) + " " + rs.getString(2) + 
	        		 " " + rs.getString(3)+ " " +rs.getString(4));

	      }

	      if (flag == true) {
	         System.out.println("\nRecords retrieved and displayed");
	      } else {
	         System.out.println("Record not found");
	      }
	   // close JDBC objects
	      rs.close();
	      st.close();
	      con.close();

	}

}
