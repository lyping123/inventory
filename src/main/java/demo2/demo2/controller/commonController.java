package demo2.demo2.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




import demo2.demo2.entity.product;
import demo2.demo2.servise.UserServise;




@Controller
public class commonController {
	// private UserServise userServise;
    private final UserServise userServise;

    
    public commonController(UserServise userServise) {
        this.userServise = userServise;
    }
	
    @GetMapping("/")
    public String getHomePage(@RequestParam(name="itemname",required = false) String query,Model model) {
        List<product> products;
        if (query != null && !query.isEmpty()) {
            products = userServise.findProductsByItem(query);
        } else {
            products = userServise.getProducts();
        }
        model.addAttribute("products", products);
        return "products";
    }
    
    @GetMapping("/product")
    public String getProductPage() {
        return "productform";
    }
    
    // @PostMapping("/addproduct")
    // public List<product> AddNewProduct(@RequestBody List<product> Products) {
    // 	//userServise.registerNewproduct(i_name, qty, price)
    //     System.out.println(Products);
    // 	return userServise.saveproducts(Products);
    // }
    

    @GetMapping("/editproduct/{id}")
    public String getAddproductsPage(@PathVariable Long id,Model model) {
        product oneproduct=userServise.getProductById(id);
        model.addAttribute("product", oneproduct);
        return "editproduct";
    }


    @GetMapping("/products/{id}")
    public product findProductById(@PathVariable Long id) {
    	return userServise.getProductById(id);
    }

    @PutMapping("/updateproduct")
    public product updateProduct(@RequestBody product Product) {
    	return userServise.updateProduct(Product); 
    }
    
    public String deleteProduct(@PathVariable Long id) {
    	return userServise.deleteProductById(id);
    }
    
    
    
    
    
    
    
    
    
    
    
   
}

