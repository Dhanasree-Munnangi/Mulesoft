import java.sql.*;

import java.util.*;
public class Insertion_Data {
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number of records to be inserted : ");
		  
		  int n=sc.nextInt();
		  for(int i=0;i<n;i++)
		  {
		  
		  System.out.println("Enter  Movie Name:");
		  String name=sc.next();
		  
		  System.out.println("Enter Hero Name:");
		  String hname=sc.next();
		  
		  System.out.println("Enter HeroIn Name: ");
		  String hename=sc.next();
		  
		  System.out.println("Enter year : ");
		  String ye=sc.next();
		  
		  System.out.println("Enter Director name: ");
		  String diname=sc.next();
		  
		    PreparedStatement pstmt=con.prepareStatement("insert into MovieCreation values(?,?,?,?,?)");
		    pstmt.setString(1,name);
		    pstmt.setString(2,hname);
		    pstmt.setString(3,hename);
		    pstmt.setString(4,ye);
		    pstmt.setString(5,diname);
		   pstmt.executeUpdate();
		    System.out.println("Created");
		  	}
		  con.close();

	}
}
