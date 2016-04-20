package helios.siteweb.dao.impl;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceProvider {

	private static MysqlDataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			dataSource = new MysqlDataSource();
			dataSource.setServerName("127.8.119.2");
			dataSource.setPort(3306);
			dataSource.setDatabaseName("helios");
			dataSource.setUser("adminKLdPf4T");
			dataSource.setPassword("kikUDH6lLnAc");
		}
		return dataSource;
	}
}
