package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ProductDAO;
import models.Product;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
	
	@GetMapping("/{productId}")
	public String productPage(@PathVariable("productId") String id, 
			Model model){
		Product product = new ProductDAO().getProduct(id);
	    model.addAttribute("product", product);
		return "product_page";
	}
}
