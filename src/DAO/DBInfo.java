package DAO;

public class DBInfo {
	private String jdbcDriver;
	private String jdbcUrl;
	private String ID;
	private String password;

	public DBInfo(String iD, String password, String DBname) {
		super();

		this.ID = iD;
		this.password = password;
		jdbcUrl = "jdbc:mysql://localhost:3306/" + DBname + "?characterEncoding=UTF-8&&serverTimezone=UTC";
	}

	public DBInfo() {
		jdbcDriver = "com.mysql.cj.jdbc.Driver";
		jdbcUrl = "jdbc:mysql://localhost:3306/jdbc?characterEncoding=UTF-8&&serverTimezone=UTC";
		ID = "root";
		password = "kim_min828049";

	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
