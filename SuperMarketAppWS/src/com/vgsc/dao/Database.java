package com.vgsc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * This class is written for getting the database connection.
 */
public class Database {

	/**
	 * This method is written for configuring Database properties and
	 * returns the connection
	 * @throws Exception
	 * @return Connection
	 */

	public Connection get_Connection() throws Exception {
		Connection connection = null;
		try {
			Properties properties = new Properties();

			properties.load(this.getClass().getClassLoader().getResourceAsStream(
					"Database.properties"));
			String userName = properties.getProperty("username");
			String password = properties.getProperty("password");
			String port = properties.getProperty("port");
			String dbName = properties.getProperty("dbName");
			String host = properties.getProperty("host");
			Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection(host + port
					+ "/" + dbName, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
