package co.edu.intecap.databases;

import java.io.FileInputStream;
import java.util.Properties;

public class MysqlConfig {
	public static Properties properties = new Properties();

	static {

		try {
			properties.load(new FileInputStream("mysql.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
