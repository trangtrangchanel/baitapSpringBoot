package com.anhduc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anhduc.model.SmartPhone;
import com.anhduc.repository.SmpRepository;

@Service
public class SmpService {
    @Autowired
    private SmpRepository smpRepository;
    public List<SmartPhone> getProducts(){
    	return (List<SmartPhone>) smpRepository.findAll();
    }
    
    public SmartPhone saveProduct(List<SmartPhone> product) {
        return (SmartPhone) smpRepository.save(product);
    }
    
    public String deleteProduct(int id) {
    	smpRepository.delete(id);
        return "product removed !! " + id;
    }
    
    public SmartPhone updateProduct(SmartPhone product) {
    	SmartPhone existingProduct = smpRepository.findOne(product.getId());
        existingProduct.setNamePhone(product.getNamePhone());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCompany(product.getCompany());
        return smpRepository.save(existingProduct);
    }
}
