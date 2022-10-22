package oopWithNLayeredAppdataAccess;

import oopWithNLayeredAppentities.Product;

public interface ProductDao {

	/* Burada sadece metodun imzasi/kontrat sekli,nde verilir.
	 birbirinin alternatifi olan yapilarda ve yeni eklenebilir yapilarin
	 surdurulebilirligi icin genel uygun kullanimdir
	 Yapilacak isin kodlari implement eden class'a ozel yazilir.
	 */
	 void add(Product product);
		
	
	
}
