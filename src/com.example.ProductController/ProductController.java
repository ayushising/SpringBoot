package com.example.Product.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.model.Product;

@RestController
@RequestMapping("/product")

public class ProductController {
	
	ArrayList<Product> product=new ArrayList<Product>();
	
	public ProductController() {
		product.add(new Product(1,"Mac","Laptop"));
		product.add(new Product(2,"Lenovo","Laptop"));
		product.add(new Product(3,"Redmi","Phone"));

	}
	
	@GetMapping("/products")
	public List<Product> getAllProduct(){
		return product;
	}
	
//	@PostMapping("/addProduct")
//	public String  addProduct(@RequestBody Product product) {
//	
//		return "product added";
//		
//	}


	
		

}
