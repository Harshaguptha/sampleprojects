package com.syncoms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** this class load the Database driver and connection is created
 * @author madhusudhan.reddy
 * @version 1.0
 * @since 2014-09-30
 *
 */
public class DBConnectionManager {

	private Connection connection;
	/*this method having three parameters and it creates database connection
	 * @param dbURL This is the first parameter to pass database URL
     * @param user  This is the second parameter to pass  database username
     * @param pwd  This is the Third parameter to pass  database password
     * @exception ClassNotFoundException and SQLException.
     * @see ClassNotFoundException and SQLException .
	 */
	public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		this.connection = DriverManager.getConnection(dbURL, user, pwd);
	}
	
	/*This method returns the database connection.
	 * @return connection object
	 */
	public Connection getConnection(){
		return this.connection;
	}
}
