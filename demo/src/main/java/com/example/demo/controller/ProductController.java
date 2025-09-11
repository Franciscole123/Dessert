package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/create")
	ResponseEntity<String> createProduct(@RequestPart("data")ProductDto dto,@RequestPart("file")MultipartFile file){
		String returnString=productService.create(dto, file);
		return ResponseEntity.ok().body(returnString);
	};
	
	
	@GetMapping("/lists")
	List<ProductDto> productLists(){
		return productService.productLists();
	}

}
