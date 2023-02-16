import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertbook {

	// values specific to each database
	   
	   // variables
	   private static final String url = "jdbc:mysql:///mydatabase";
	   private static final String user = "root";
	   private static final String password = "2558";
	   // SQL Query
	   private static final String INSERT_Book_QUERY =
	                "INSERT INTO book VALUES (?,?,?,?)";
  
		 public static void main(String[] args ) {

		     // declare variables
		     Scanner scan = null;
		     int n = 0;
//		     int SNo = 0;
		     int id = 0;
		     String bookname = null;
		     String authorname = null;
		     String edition = null;
		     Connection con = null;
		     PreparedStatement ps = null;
		     int result = 0;

		     try {
		        // create Scanner class object
		        scan = new Scanner(System.in);
		        
		        // take number of students
		        if(scan != null) {
		            System.out.print("Enter Number of Books: ");
		            n = scan.nextInt();
		        }

		        // establish the connection
		        con = DriverManager.getConnection(url, user, password);
			      // create JDBC statement object
			    

		        // compile SQL query and store it in
		        // PreparedStatement object
		        if(con != null) {
		           ps = con.prepareStatement(INSERT_Book_QUERY);
		        }
		        
		        if(scan != null && ps != null) {
		           for(int i=0; i<n; i++) {

		              // read input values
		              System.out.println("\nEnter Book "+(i+1)+" details,");
		              System.out.print("bookId: ");
		              id = scan.nextInt();
		              System.out.print("bookName: ");
		              bookname = scan.nextLine();
		              bookname+=scan.nextLine();
		              System.out.print("authorName: ");
		              authorname = scan.nextLine();
		       
		              System.out.print("edition: ");
		              edition = scan.nextLine();
		           
		              ps.setInt(1, id);
		              ps.setString(2, bookname);
		              ps.setString(3, authorname);
		              ps.setString(4, edition);
		              

		              // execute the query
		              result = ps.executeUpdate();
		           }
		        }
		        
		        // process the result
		        if(result == 0) {
		           System.out.println("\nRecords insertion failed");
		        } else {
		           System.out.println("\nRecords inserted successfully.");
		        }

		     } catch(SQLException se) {
		        se.printStackTrace();
		     } catch(Exception e) {
		        e.printStackTrace();
		     } // try-catch block 

		     finally {
		        // close JDBC objects
		        try {
		           if(ps != null) ps.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(con != null) con.close();
		        } catch(SQLException se) {
		           se.printStackTrace();
		        }
		        try {
		           if(scan != null) scan.close();
		        } catch(Exception e) {
		           e.printStackTrace();
		        }
		     } // finally
		   } // main()
	}