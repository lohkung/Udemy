package net.action.struts2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	private String cardname;

	public String execute() {
//		if (this.username.equals("admin") && this.password.equals("admin123")) {
//			return "success";
//		} else {
//			return "error";
//		}
		
		String result="error";
	    Connection connection=null;
	   try
	   {
//	    String URL = "jdbc:sqlserver://localhost:1433;" +  
//	    		   "databaseName=payment;user=;password=;";
	    String URL = "jdbc:sqlserver://localhost:1433;" +
	     "instance=./SQLEXPRESS;databaseName=payment;integratedSecurity=true;";
	    

	    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    connection = DriverManager.getConnection(URL);
	    String sql = "SELECT cardnumber FROM creditcard ";
	     
	    
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	          
	    ResultSet resultset = preparedStatement.executeQuery();
	    while(resultset.next())
	      {
	    	cardname = resultset.getString("cardnumber");
	      result="success";
	      }//while
	    username +=  " : " +cardname;
	     } //try
	   
	   	
	     catch (Exception e)
	     {
	      result ="error";
	      } //catch
	    finally
	    {
	     if (connection != null)
	      {
	       try
	        {
	    	   connection.close();
	          } //try
	       catch (Exception e)
	       {
	        System.out.println(e);
	        }//catch
	      }//if
	    }//finally
	   return result;
	   
	 
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public String getCardname() {
		return cardname;
	}

	public void setCardname(String cardname) {
		this.cardname = cardname;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
