package bazaarmd.northwind.business.concrate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bazaarmd.northwind.business.abstracts.ProductService;
import bazaarmd.northwind.core.utilities.results.DataResult;
import bazaarmd.northwind.core.utilities.results.SuccessDataResult;
import bazaarmd.northwind.dataAccess.abstracts.ProductDao;
import bazaarmd.northwind.entities.concrate.Product;



@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<Product> getByProductname(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Product>
		(this.productDao.getByProductname(productName),"Data Listelendi...");
	}


	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Product>
		(this.productDao.getByProductNameAndCategory(productName, categoryId),"Data Listelendi...");
	}


	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameOrCategory(productName, categoryId),"Data Listelendi...");
	}


	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByCategoryIdIn(categories),"Data Listelendi...");
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameContains(productName),"Data Listelendi...");
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByProductNameStartsWith(productName),"Data Listelendi...");
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>
		(this.productDao.getByNameAndCategory(productName,categoryId),"Data Listelendi...");
	}
	
	
	 
}
