package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

@Repository
public interface ProductService {
	
	
	List<ProductDto> productLists();
	
	ProductDto productById(Long id);
	
	String create(ProductDto pdto,MultipartFile file);
	
	ProductDto updateProduct(Long id,ProductDto pdto);
	
}
