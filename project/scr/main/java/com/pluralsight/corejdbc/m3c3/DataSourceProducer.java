package com.pluralsight.corejdbc.m3c3;

import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import static com.pluralsight.corejdbc.common.ConstantProperties.DB_URL;

public class DataSourceProducer {

	private MysqlDataSource mySqldataSource;

	@Produces
	@MySqlDataSource
	public DataSource produceDataSource() {
		// read properties from somewhere here

		if (mySqldataSource == null) {
			mySqldataSource = new MysqlDataSource();
			mySqldataSource.setPassword("root");
			mySqldataSource.setUser("root");
			mySqldataSource.setURL(DB_URL);
		}
		return mySqldataSource;
	}
}
