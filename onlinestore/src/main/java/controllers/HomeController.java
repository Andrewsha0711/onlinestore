package controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dao.ProductCategoryDAO;
import dao.ProductDAO;
import models.Product;
import models.ProductCategory;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage(Model model){
		ArrayList<Product> products = new ProductDAO().getProducts(1, 20);
		ArrayList<ProductCategory> categories = new ProductCategoryDAO().getProductCategories();
		model.addAttribute("products", products);
		model.addAttribute("categories", categories);
		return "home_page";
	}
}
