import java.sql.*;

  public class Selectdetails{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##mydb11am","123");
	
	Statement st=con.createStatement();
	
	ResultSet rs= st.executeQuery("SELECT * FROM STUDENT");
	
	while(rs.next()!=false) {
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
	}//close jdbc objs
	rs.close();
	st.close();
	con.close();

	}

}

