package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("�����ͺ��̽� ����õ� ����");
		} catch(ClassNotFoundException e) {
			System.out.print("�����ͺ��̽� ����õ� ����");
			System.exit(0);
		}
		String url= "jdbc:mysql://localhost:3306/kimdb";
		String username = "jiho";
		String password = "1234";
		java.sql.Connection connection = null;
		System.out.println("�����ͺ��̽� �������Դϴ�.");
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("�����ͺ��̽� ���� �Ϸ��߽��ϴ�.");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ����õ� ����");
			System.exit(0);
		}
		String query = "select * from st";
		Statement stmt;
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) +
						"- �̸� : " + rs.getString(2) +
						", �а� : " + rs.getString(3) +
						", ���� : " + rs.getString(4) +
						", ���г⵵ : " + rs.getString(5));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("���� �����մϴ�.");
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					
				}
			}
		}
	}

}
