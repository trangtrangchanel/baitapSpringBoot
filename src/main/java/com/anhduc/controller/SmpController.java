package com.anhduc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anhduc.model.SmartPhone;
import com.anhduc.service.SmpService;

@RestController
public class SmpController {
	@Autowired
	private SmpService serivce;
	
	@GetMapping("/test")
    public ResponseEntity <String> testSpringBoot() {
        return ResponseEntity.ok("Success");
    }
	@GetMapping("/new")
	public List<SmartPhone> findAllProducts(){
		return  serivce.getProducts();
	}
    @PostMapping("/addProducts")
    public List<SmartPhone> addProducts(@RequestBody List<SmartPhone> products) {
    	return (List<SmartPhone>) serivce.saveProduct(products);
    }
    @PutMapping("/update")
    public SmartPhone updateProduct(@RequestBody SmartPhone product) {
        return serivce.updateProduct(product);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return serivce.deleteProduct(id);
    }
	
	
}
