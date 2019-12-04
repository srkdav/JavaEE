package com.app.pojos;
import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String prodName;
	private Double prodPrice;
	private boolean availability;
	public Product() {
		super();
		
	}
	public Product(String prodName, Double prodPrice, boolean availability) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.availability = availability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	
	
	
}
