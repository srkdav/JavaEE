package validationCheck;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import customExcep.ProductCustomException;
import utility.Product;

public class validationRule {
	public static SimpleDateFormat sdf;
	public static Date expDate;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			expDate = sdf.parse("25-11-2019");
		} catch (ParseException e) {
			System.out.println("err in static inin block" + e);
		}
	}
	public static Date validateDate(String s) throws ProductCustomException, ParseException
	{
	Date d = sdf.parse(s);
	if(d.before(expDate))
	{
		throw new ProductCustomException("Product expired!");
	}
	return d;
	}
	
	public static String validateProdNamePrice(Product p,List<Product> list) throws ProductCustomException
	{
	for(Product l:list)
		{
		if(l.getProdName().equals(p.getProdName()) && l.getProdPrice().equals(p.getProdPrice()))
		{
			throw new ProductCustomException("Product already in list");
		}
		}
	return "Can be added!";

		
		
	}
	
}
