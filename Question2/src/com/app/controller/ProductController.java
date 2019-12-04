package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.ProdException.ProdException;
import com.app.pojos.Product;
import com.app.service.IProdService;

@Controller
@RequestMapping("/admin")
public class ProductController {
@Autowired
private IProdService service;
	@GetMapping("/list")
	public String showList(Model map)
	{
	
		map.addAttribute("prod_details", service.listAllProduct());
		return "/admin/list";
	}
	
	@GetMapping("/form")
	public String showForm(Product p)
	{
		return "/admin/form";
	}
	
	@PostMapping("/form")
	public String processForm(Product pnew,Model map) throws ProdException
	{
		
		try {
			System.out.println("in try");
			map.addAttribute("new_details", service.addNewProd(pnew));
		} 
		catch (Exception e) // If Product name and price matches, redirect Admin.
		{
			System.out.println("in catch");
			return "redirect:/admin/err";
		}//If no error, redirect Admin to list
		System.out.println("after try/catch");
		return "redirect:/admin/list";
	}
	
	@GetMapping("/err")
	public String showError()
	{
		return "/admin/err";
	}
	
}
