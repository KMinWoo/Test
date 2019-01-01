package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LinkDB {
	public Connection conn;
	public PreparedStatement pstmt;
	public ResultSet rs;
	private DBInfo user;

	public LinkDB() {
		user = new DBInfo();
	}

	public void connectDB() {
		try {
			// Class.forName(jdbcDriver);

			conn = DriverManager.getConnection(user.getJdbcUrl(), user.getID(), user.getID());
			System.out.print("연결성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
