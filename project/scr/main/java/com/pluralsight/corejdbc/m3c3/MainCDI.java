package com.pluralsight.corejdbc.m3c3;

public class MainCDI {

	public static void main(String[] args) throws Exception {
		try {
			ProductsComponentCDI component = new ProductsComponentCDI();
			DataSourceProducer producer = new DataSourceProducer();
			component.dataSource = producer.produceDataSource();

			if (component.getProductCount()) {
				System.out.println("Demo m3c3: Try to Connect with CDI DataSource");
				System.out.println("SUCCESS");
			} else {
				System.out.println("Demo m3c3: Try to Connect with CDI DataSource");
				System.out.println("FAILED");
			}

		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}
	}

}
