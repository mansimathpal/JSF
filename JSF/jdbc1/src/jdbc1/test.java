package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/man2";
		String username = "root";
		String password ="mansi123";
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection established successfully!!!");
		Statement stmt = conn.createStatement();
		String sql = "select * from studen";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt("id")+" : "+rs.getString("name")+" :"+rs.getString("address")+" :"+rs.getInt("age"));
		}

	}

}
