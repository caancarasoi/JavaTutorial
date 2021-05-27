package bazaarmd.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bazaarmd.northwind.entities.concrate.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	Product getByProductname(String productName);
	
	Product getByProductNameAndCategory(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory(String productName, int categoryId);
	
	List<Product> getByCategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);

	//query yazarken Product tablo deıl entity adı olacak
	@Query("From Product where productName=:productName and category_id=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
	
	// select * from products where product_name = bisey and category_id = bisey	
}
