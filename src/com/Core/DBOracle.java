package com.Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBOracle {
	private static String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static String HOST = null;
	private static String DBUSER = null;
	private static String DBPWD = null;
	private static String DBURL = null;
	

	public DBOracle() {
		try {
			Properties props = new Properties();
			FileInputStream fin = new FileInputStream("TestData/DBConn.properties");
			props.load(fin);
			fin.close();
			
			// Get test server
			Properties props2 = new Properties();
			FileInputStream fin2 = new FileInputStream("src/com/resource/InitialConfig.properties");
			props2.load(fin2);
			fin2.close();
			String BROWSER_URL =  props2.getProperty("BROWSER_URL");
			
			
			// Get DB info
			if (BROWSER_URL.contains(".101")) {
				HOST = props.getProperty("HOST_163");
				DBUSER = props.getProperty("USERNAME");
				DBPWD = props.getProperty("PASSWORD");
				
			} else if (BROWSER_URL.contains(".64")) {
				HOST = props.getProperty("HOST_64");
				DBUSER = props.getProperty("USERNAME_64");
				DBPWD = props.getProperty("PASSWORD_64");
				
			} 
			DBURL = "jdbc:oracle:thin:@" + HOST;
			System.out.println(DBURL + ":" + DBUSER);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * @Title: getConn
	 * @Description: TODO
	 * @param @return 
	 * @return Connection 
	 * @throws
	 */
	public Connection getConn() {
		Connection conn = null;
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
		}
		return conn;
	}
	
	
	/**
	 * @Title: closeDB
	 * @Description: TODO
	 * @param @param con
	 * @param @param sm
	 * @param @param rs 
	 * @return void 
	 * @throws
	 */
	public  void closeDB(Connection conn, Statement sm, ResultSet rs) {
		try {
			if (null != conn) {
				conn.close();
			}
			if (null != sm) {
				sm.close();
			}
			if (null != rs) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
