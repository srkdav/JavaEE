package tester;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import customExcep.ProductCustomException;
import utility.Product;
import utility.Utils;
import validationCheck.validationRule;

public class test1 {
@SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException, ProductCustomException, ParseException, ClassNotFoundException
	{
	try(Scanner sc= new Scanner(System.in))
	{
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.bin"));
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.bin")))
			{
			ArrayList<Product> list = Utils.populate();
			//ArrayList<Product> list = (ArrayList<Product>) in.readObject();
			//in.close();
			//for(Product l:list)
			//System.out.println(l.toString());
				
			boolean exit = false;
			while(!exit)
			{
			System.out.println("Enter your option "
					+ "1. Display all products "
					+ "2. Add new product "
					+ "3.Exit");	
			switch(sc.nextInt())
			{	
			case 1:
				for(Product l:list)
				{
					System.out.println(l.toString());
				}
				break;
			case 2:
				System.out.println("Enter id,name,price,date(dd-mm-yyyy)");
				Product p1 = new Product(sc.nextInt(),sc.next(),sc.nextDouble(),validationRule.validateDate(sc.next()));
			//	Product p1 = new Product(4,"pqr",2200.0,validationRule.validateDate("01-01-2022"));
				validationRule.validateProdNamePrice(p1, list);
				list.add(p1);
				System.out.println("added!");
				break;
			case 3:
				exit=true;
				break;
			}
			}
			out.writeObject(list);
			out.close();
			out.flush();
		}
	}catch(EOFException e)
	{
		e.printStackTrace();
	}
	
}
}
