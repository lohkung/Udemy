package action;

import com.opensymphony.xwork2.ActionSupport; 

import dao.LoginDAO;
import dao.ProductManagementDAO;
import pojo.LoginInfo;
import pojo.Product;

public class DeleteAction extends ActionSupport{

	String productId;
	
	public String execute() {
		String statusCode = "";
		System.out.println("Delete execute() method called");
		System.out.println("Product Id = "+productId);
		int recordUpdated = ProductManagementDAO.deleteProduct(productId);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
}
