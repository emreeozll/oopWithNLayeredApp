package oopWithNLayeredApp;

import oopWithNLayeredAppbusiness.ProductManager;
import oopWithNLayeredAppcore.logging.DatabaseLogger;
import oopWithNLayeredAppcore.logging.FileLogger;
import oopWithNLayeredAppcore.logging.Logger;
import oopWithNLayeredAppcore.logging.MailLogger;
import oopWithNLayeredAppdataAccess.HibernateDao;
import oopWithNLayeredAppentities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// Arayuz is birimi ile calisir, veritabani kodlarina erisemez - API olmadigini varsayarak

		Product product1 = new Product(1, "Iphone", 90);
		System.out.println(product1.getPrice());

		Logger [] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateDao(), loggers);
		productManager.add(product1);;

	}

}
