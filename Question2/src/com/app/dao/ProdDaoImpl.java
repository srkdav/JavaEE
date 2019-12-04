package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.ProdException.ProdException;
import com.app.pojos.Product;
@Repository
public class ProdDaoImpl implements IProdDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public List<Product> listAllProduct() {
		String jpql = "select p from Product p";
		List<Product> list = sf.getCurrentSession().createQuery(jpql,Product.class).getResultList();
		return list;
		
	}

	@Override
	public String addNewProd(Product p) throws ProdException {
		String jpql = "select p from Product p";
		List<Product> list = sf.getCurrentSession().createQuery(jpql,Product.class).getResultList();
		for(Product l:list)
		{
			if(p.getProdName().equals(l.getProdName()) && p.getProdPrice().equals(l.getProdPrice()))
			{
			
				throw new ProdException("Invalid!");
			}
		}
		sf.getCurrentSession().persist(p);	
		return "added";
	}
	

}
