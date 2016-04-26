package helios.siteweb.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {

	private static MysqlDataSource dataSource;
	private static final String USERNAME = "adminKLdPf4T";
	private static final String PASSWORD = "kikUDH6lLnAc"; //*AEBE8E418CEB144D74A94174358277B097E4141C
	private static final String DB_NAME = "helios";
	private static final String SERV = "127.8.119.2";
	private static final String PORT = "3306";

	
	
	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName(SERV);
			dataSource.setPort(3306);
			dataSource.setDatabaseName(DB_NAME);
			dataSource.setUser(USERNAME);
			dataSource.setPassword(PASSWORD);
			
			//System.out.println(""+dataSource.getURL());

		}
		return dataSource;
	}
}
