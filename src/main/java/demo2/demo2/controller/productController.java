package demo2.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import demo2.demo2.entity.product;
import demo2.demo2.servise.UserServise;


@Controller
public class productController {
    @Autowired
    private  UserServise userServise;
    

    @PostMapping("/addproduct")
    public String addproduct(@ModelAttribute product products){
        try{
            userServise.saveproducts(products);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/";
    }

    @PostMapping("/editproduct/{id}")
    public String editproduct(@ModelAttribute product products){
        try{
            userServise.updateProduct(products);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/";
    }

    @GetMapping("deleteproduct/{id}")
    public String deleteProduct(@PathVariable Long id){
        try{
            userServise.deleteProductById(id);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:/";
    }


    
}
