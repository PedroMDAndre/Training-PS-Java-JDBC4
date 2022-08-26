package com.pluralsight.corejdbc.m3c3;

public class MainJEE {

	public static void main(String[] args) throws Exception {
		try {
			ProductsComponentJEE component = new ProductsComponentJEE();
			DataSourceProducer producer = new DataSourceProducer();
			component.dataSource = producer.produceDataSource();

			if (component.getProductCount()) {
				System.out.println("Demo m3c3: Try to Connect with JEE DataSource");
				System.out.println("SUCCESS");
			} else {
				System.out.println("Demo m3c3: Try to Connect with JEE DataSource");
				System.out.println("FAILED");
			}

		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}
	}

}
