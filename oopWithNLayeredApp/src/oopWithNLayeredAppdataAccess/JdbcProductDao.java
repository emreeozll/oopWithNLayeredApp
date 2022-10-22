package oopWithNLayeredAppdataAccess;

import oopWithNLayeredAppentities.Product;

public class JdbcProductDao  implements ProductDao{

	//Jdbc bir yöntemdir.
	@Override
	public void add(Product product) {
		//sadece ve sadece db erisim kodlari buraya eklenir.
		System.out.println("JDBC ile veritabanina eklendi.");
	}
	
}
