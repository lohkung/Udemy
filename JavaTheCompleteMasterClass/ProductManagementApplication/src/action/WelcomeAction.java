package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport; 

import dao.LoginDAO;
import dao.ProductManagementDAO;
import pojo.LoginInfo;
import pojo.Product;

public class WelcomeAction extends ActionSupport{
	
	List<Product> products;
	
	public void initializeProducts()
	{
		products = ProductManagementDAO.getAllProducts(); 
	}
	
	public String execute() {
		System.out.println("WELCOME execute() method called");
		initializeProducts();
		return "success";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
