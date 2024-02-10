package demo2.demo2.servise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import demo2.demo2.entity.product;
import demo2.demo2.repository.*;

@Service
public class UserServise {
	@Autowired
	private ProductRepository productRepository;
		
	
	public product registerNewproduct(String item,int qty,String price) {
		product Product=new product();
		
		Product.setItem(item);
		Product.setQty(qty);
		Product.setPrice(price);
		
		return productRepository.save(Product);
	}
	
	public product saveproducts(product products){
		return productRepository.save(products);
	}
	
	public List<product> getProducts(){
		return productRepository.findAll();
	}
	
	public product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public List<product> findProductsByItem(String itemName) {
		return productRepository.findByItem(itemName);
	}
	
	public String deleteProductById(Long id) {
		productRepository.deleteById(id);
		return "Product have removed!!"+id;
	}
	
	public product updateProduct(product Product) {
		product existingProduct=productRepository.findById(Product.getId()).orElse(null);
		existingProduct.setItem(Product.getItem());
		existingProduct.setQty(Product.getQty());
		existingProduct.setPrice(Product.getPrice());
		return productRepository.save(existingProduct);
		
	}
	
	
	
	
	
	
	
	
	

}
