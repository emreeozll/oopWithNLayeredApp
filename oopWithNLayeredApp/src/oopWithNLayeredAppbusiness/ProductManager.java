package oopWithNLayeredAppbusiness;

import oopWithNLayeredAppcore.logging.Logger;
import oopWithNLayeredAppdataAccess.HibernateDao;
import oopWithNLayeredAppdataAccess.JdbcProductDao;
import oopWithNLayeredAppdataAccess.ProductDao;
import oopWithNLayeredAppentities.Product;

public class ProductManager {
	private ProductDao productDao; // Dependcy Injection
	// burada sadece interface bagimliligi söz konusu en ufak jdbc - hibernate
	// bagimliligi yok
	// new'lemek bellekte cok pahalidir ve bagimlilik sistemi yeniliklere acik
	// tutmaz
	// Bağımlılık oluşturacak nesneleri direkt olarak kullanmak yerine, bu nesneleri
	// dışardan verilmesiyle
	// sistem içerisindeki bağımlılığı minimize etmek amaçlanır.
	// Böylece bağımlılık bulunan sınıf üzerindeki değişikliklerden korunmuş oluruz.

	private Logger [] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		// is kurallari

		if (product.getPrice() < 10) {

			throw new Exception("Urunun fiyati 10'dan kucuk olamaz.");
		}

		// ProductDao productDao = new JdbcProductDao(); ==>> direkt olarak kullanmak
		// yerine
		productDao.add(product);

		// ProductDao productDao = new HibernateDao(); ==>> direkt olarak kullanmak
		// yerine
		//productDao.add(product);
		
		for(Logger logger:loggers) {
			logger.log(product.getName());
		}
		
	}

}
