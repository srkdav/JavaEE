package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ProdException.ProdException;
import com.app.dao.IProdDao;
import com.app.pojos.Product;

@Service
@Transactional
public class ProdServiceImpl implements IProdService {
@Autowired
private IProdDao dao;
	
	@Override
	public List<Product> listAllProduct() {
		
		return dao.listAllProduct();
	}

	@Override
	public String addNewProd(Product p) throws ProdException {
	
		dao.addNewProd(p);
		
		return "added!";
	}

}
