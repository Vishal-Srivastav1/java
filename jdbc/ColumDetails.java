package com.nt.jdbc;
  //JDBC app that gets employee details from EMP DB table based on give
   // 3 designation
   //version :: 1.0
   //author :: team-v
import java.util.Scanner;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class ColumDetails{
   
   public static void main(String[]args){
    Scanner sc= null;
    String desg1=null,desg2=null,desg3=null;
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    try{
        sc=new Scanner(System.in);
      if(sc!=null){ 
        System.out.println("Enter desg1 name :");
          desg1=sc.next().toLowerCase();//.toUpperCase();
         System.out.println("Enter desg2name :");
          desg2=sc.next().toLowerCase();//.toUpperCase();
          System.out.println("Enter desg3 name :");
          desg3=sc.next().toLowerCase();//.toUpperCase();
    }
    desg1="'"+desg1+"'";      //gives 'cleark'
     desg2="'"+desg2+"'";     //gives 'manager'
      desg3="'"+desg3+"'";     //gives 'salesman'


    //Load JDBC driver class
    //Class.forname("oracle.jdbc.driver.OracleDriver");

    //estavlish the connection
     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","c##mydb11am","123");

          //create Statement object
     if(con!=null)
        st=con.createStatement();
        //prepare SQL query
       // select details what we need
       String query ="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN("+desg1+","+desg2+","+desg3+")ORDER BY JOB";
           System.out.println(query);


           //send and execute sql Query in db s/w
        if(st!=null)
         rs=st.executeQuery(query);

         if(rs!=null){
         System.out.println("The Employee details are ");
      
        while(rs.next()!=false){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getInt(5));
        }//while close
     
   }//if close
} //try close 
   catch(SQLException se){ // To handle known exception
     se.printStackTrace();// gives details info about the raised exception
   }catch(Exception e){   // To handle unknown exception
     e.printStackTrace();//gives details info about the raised exception
}
finally{
  //close jdbc objs & stream onjects
try{
    if(rs!=null)
    rs.close();
}catch(SQLException se){
    se.printStackTrace();
}

try{
    if(st!=null)
    st.close();
}catch(SQLException se){
    se.printStackTrace();
}

try{
    if(con!=null)
    con.close();
}catch(SQLException se){
    se.printStackTrace();
}

try{
    if(sc!=null)
    sc.close();
}catch(Exception e){
    e.printStackTrace();
}


}//finally close
} //main
}  //class

