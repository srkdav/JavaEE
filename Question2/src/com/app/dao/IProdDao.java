package com.app.dao;
import java.util.List;

import com.app.ProdException.ProdException;
import com.app.pojos.*;
public interface IProdDao {

	List<Product> listAllProduct();
	String addNewProd(Product p) throws ProdException;
	
}
