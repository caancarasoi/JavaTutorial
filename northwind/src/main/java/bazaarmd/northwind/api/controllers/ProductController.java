package bazaarmd.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bazaarmd.northwind.business.abstracts.ProductService;
import bazaarmd.northwind.core.utilities.results.DataResult;
import bazaarmd.northwind.entities.concrate.Product;
import bazaarmd.northwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private ProductService productService;
	
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
 

	@GetMapping("/getall")
	public List<Product> getAll(){
		return (List<Product>) this.productService.getAll();
	}
	
	@GetMapping("/getByProductName")
	public DataResult<Product> getByProductName(@RequestParam("productName") String productName){
		
		return this.productService.getByProductname(productName);
	}
	
	@GetMapping("/getByProductNameAndCategoryId")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName,@RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategory(productName, categoryId);
	}
	
	@GetMapping("/getPeoductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> ProductWithCategoryDto(){
		return this.productService.getProductWithCategoryDetails();
	}
	
	 
	

}
