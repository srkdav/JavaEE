package utility;

import java.io.Serializable;
import java.util.Date;


public class Product implements Serializable {

	private static final long serialVersionUID = -5525567760433440688L;
	private Integer id;
	private String prodName;
	private Double prodPrice;
	private Date date;
	public Product() {
		
	}
	public Product(int id, String prodName, Double prodPrice, Date date) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public String getProdName() {
		return prodName;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", date=" + date + "]";
	}
	@Override
	public boolean equals(Object O)
	{
		if(this.prodName.equals(this.prodName) && this.prodPrice.equals(this.prodPrice))
		{
			return true;
		}
	return false;
	}
}



//public static int id_get
//static{ id_get = 0}
