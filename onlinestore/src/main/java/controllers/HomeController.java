package controllers;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dao.ProductDAO;
import models.Product;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String homePage(Model model){
		//model.addAttribute("categories", categories);
		return "home_page";
	}
	
	@GetMapping("/catalog")
	public String productsByCategoryPage(Model model){
		ArrayList<Product> products = new ProductDAO().getProducts(1, 20);
//		String baseURL = ServletUriComponentsBuilder
//				.fromCurrentContextPath().build().toUriString();
//		model.addAttribute("baseURL", baseURL);
		model.addAttribute("products", products);
		return "category_catalog";
	}
}
