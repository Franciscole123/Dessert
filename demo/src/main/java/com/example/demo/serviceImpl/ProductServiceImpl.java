package com.example.demo.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.ProductDao;
import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ProductDao pDao;

	@Override
	public List<ProductDto> productLists() {
		
		return pDao.findAll().stream().map(s->this.toDto(s)).toList();
	}

	@Override
	public ProductDto productById(Long id) {
		return null;
	}

	@Override
	public String create(ProductDto pdto,MultipartFile file) {
		Product p=new Product();
		p.setCategoryName(pdto.getCategoryName());
		p.setDescription(pdto.getDescription());
	    try {
			p.setImage(file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	    p.setPrice(pdto.getPrice());
	    p.setProductName(pdto.getProductName());
	    p.setStatusName(pdto.getStatusName());
	    p.setPurchaseCount(pdto.getPurchaseCount());
		pDao.save(p);
		return "Product name %s is create successfully".formatted(p.getProductName());
	}
	
	
	private ProductDto toDto(Product p) {
		ProductDto dto=new ProductDto();
		dto.setId(p.getId());
		dto.setProductName(p.getProductName());
		dto.setDescription(p.getDescription());
		dto.setCategoryName(p.getCategoryName());
		dto.setPrice(p.getPrice());
		dto.setImage(p.getImage());
		dto.setStatusName(p.getStatusName());
		dto.setPurchaseCount(p.getPurchaseCount());
		return dto;
	}

	@Override
	public ProductDto updateProduct(Long id, ProductDto pdto) {
		// TODO Auto-generated method stub
		return null;
	}

}
