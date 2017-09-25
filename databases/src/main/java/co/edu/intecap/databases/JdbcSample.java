package co.edu.intecap.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class JdbcSample {

	static {
		try {
			Class.forName(MysqlConfig.properties.getProperty("jdbc.driver")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JdbcSample jdbc = new JdbcSample();
		jdbc.insertData(jdbc.getConnection());
		jdbc.queryBodegas(jdbc.getConnection());
		
		
	}

	private void queryBodegas(Connection con) {

		try {
			String query = "SELECT * FROM CESAR.BODEGA";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString("ID"));
				System.out.println(rs.getString("NOMBRE"));
				System.out.println(rs.getString("DIRECCION"));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void insertData(Connection con) {
		try {
			PreparedStatement statement = con.prepareStatement(MysqlConfig.properties.getProperty("jdbc.querybodega"));

			statement.setString(1, UUID.randomUUID().toString());
			statement.setString(2, "Bodega m");
			statement.setString(3, "Avenida y con z");

			statement.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Connection getConnection() {

		Connection con = null;
		String url = MysqlConfig.properties.getProperty("jdbc.url");
		String usr = MysqlConfig.properties.getProperty("jdbc.usr");
		String pwd = MysqlConfig.properties.getProperty("jdbc.pwd");

		try {
			con = DriverManager.getConnection(url, usr, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;
	}

}
