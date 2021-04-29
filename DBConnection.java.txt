package PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static final String dbDriverName = "oracle.jdbc.driver.OracleDriver";
	private static final String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String dbUserName = "SYSTEM";
	private static final String dbPasword = "SYSTEM";

	// this will create Connection object
	public static final Connection getConnection() {

		Connection con = null;
		try {
			Class.forName(DBConnection.dbDriverName);
			System.out.println("Driver Loaded Successfully...");

			con = DriverManager.getConnection(DBConnection.dbURL, DBConnection.dbUserName, DBConnection.dbPasword);

			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
