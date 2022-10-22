package oopWithNLayeredAppdataAccess;

import oopWithNLayeredAppentities.Product;

public class HibernateDao implements ProductDao {

	@Override
	public void add(Product product) {
			//sadece ve sadece db erisim kodlari buraya eklenir.
			System.out.println("Hibernate ile veritabanina eklendi.");
	}

	
	
}
