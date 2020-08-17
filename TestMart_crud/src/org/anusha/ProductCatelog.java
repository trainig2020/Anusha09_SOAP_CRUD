package org.anusha;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.anusha.model.Product;


@WebService
public interface ProductCatelog {
     
	@WebMethod
	 List<Product> getAllProducts();
    
	@WebMethod
	 Product getProduct(int pid);
    
	@WebMethod
	 boolean addProduct(String pname , double price);
	
	@WebMethod
	 boolean updateProduct(int pid , String pname , double price);
	
	@WebMethod
	 boolean deleteProduct(int id);
    
}