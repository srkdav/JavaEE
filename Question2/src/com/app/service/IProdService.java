package com.app.service;

import java.util.List;

import com.app.ProdException.ProdException;
import com.app.pojos.Product;

public interface IProdService {
	List<Product> listAllProduct();
	String addNewProd(Product p) throws ProdException;
}
