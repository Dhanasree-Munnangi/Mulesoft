import java.sql.*;
public class TableCreation {
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	    PreparedStatement pstmt=con.prepareStatement("create table Moviescreation(Name varchar2(50),Hero_Na varchar2(50),Heroin_Na varchar2(50),year varchar2(30),director_na varchar(30))");
	    pstmt.executeUpdate();
	    con.close();
	}

}
