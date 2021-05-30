package bazaarmd.northwind.business.abstracts;
 

import java.util.List;


import org.springframework.data.jpa.repository.Query;

import bazaarmd.northwind.core.utilities.results.DataResult;
import bazaarmd.northwind.entities.concrate.Product;
import bazaarmd.northwind.entities.dtos.ProductWithCategoryDto;


public interface ProductService {
	 
		DataResult<List<Product>> getAll();
	
		DataResult<Product> getByProductname(String productName);
		
	 	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
		
		DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
		
		DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
		
		DataResult<List<Product>> getByProductNameContains(String productName);
		
		DataResult<List<Product>> getByProductNameStartsWith(String productName);

		//query yazarken Product tablo deıl entity adı olacak
		@Query("From Product where productName=:productName and categoryId=:categoryId")
		DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
		
		DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(); 
}
