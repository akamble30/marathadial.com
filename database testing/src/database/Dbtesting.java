package database;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class Dbtesting {

	public static void main(String[] args) {
		
	try{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		/*Statement stmp= (Statement) con.createStatement();
		ResultSet rs= (ResultSet) stmp.executeQuery("select name from student where name like'%l'");
		while(rs.next())
			System.out.println(rs.getInt(1)+" " +rs.getString(2)+" " +rs.getInt(3)+" "  );*/
		
		String query="insert into student (sid,name,marks) values (?,?,?)";
		PreparedStatement ps=(PreparedStatement) con.prepareStatement(query );
		ps.setString(1,"3");
		ps.setString(2, "suraj");
		ps.setString(3, "400");
		ps.execute();
	
		
		
		
		con.close();
		
	}
	catch(Exception e)

	{
		System.out.println(e);
		
	}
		

	}

}
