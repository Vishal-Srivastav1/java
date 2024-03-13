import java.sql.*;
public class FirstConn{
 public static void main(String[]args)throws Exception{
	 //establish the connection
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##mydb11am","123");
	 System.out.println("con object class name "+con.getClass()); 
	 
	 if(con==null)
		 System.out.println("Connection is not established");
	  else
		  System.out.println("Connection is established");
 }
}
