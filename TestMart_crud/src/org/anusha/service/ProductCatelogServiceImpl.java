package org.anusha.service;

import java.util.List;

import javax.jws.WebService;

import org.anusha.dao.ProductCatelogDao;
import org.anusha.dao.ProductCatelogDaoImpl;
import org.anusha.model.Product;

@WebService(endpointInterface = "org.anusha.service.ProductCatelogService")
public class ProductCatelogServiceImpl implements ProductCatelogService {
    
	ProductCatelogDao productCatelogDao = new ProductCatelogDaoImpl();
	
	@Override
	public List<Product> getAllProducts() {
		return  productCatelogDao.getAllProducts();
		
	}

	@Override
	public Product getProduct(int pid) {
		return productCatelogDao.getProduct(pid);
		
	}

	@Override
	public boolean addProduct(Product product) {
		productCatelogDao.addProduct(product);
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		productCatelogDao.updateProduct(product);
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		productCatelogDao.deleteProduct(id);
		return false;
	}
     

}
