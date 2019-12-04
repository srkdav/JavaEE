package utility;

import java.text.ParseException;
import java.util.ArrayList;

import customExcep.ProductCustomException;
import validationCheck.validationRule;

public class Utils {
public static ArrayList<Product> populate() throws ProductCustomException, ParseException 
{
	ArrayList<Product> list = new ArrayList<Product>();
	list.add(new Product(1,"pqr",2200.0,validationRule.validateDate("01-01-2020")));
	list.add(new Product(2,"lmn",1100.0,validationRule.validateDate("01-01-2020")));
	list.add(new Product(3,"qwe",2100.0,validationRule.validateDate("01-01-2020")));
	return list;
}
}
