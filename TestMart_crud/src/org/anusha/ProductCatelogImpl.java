package org.anusha;
import java.util.List;





import javax.jws.WebService;

import org.anusha.model.Product;
import org.anusha.service.ProductCatelogServiceImpl;
import org.anusha.service.ProductCatelogService;

@WebService(endpointInterface = "org.anusha.ProductCatelog")
public class ProductCatelogImpl implements ProductCatelog {
     
	ProductCatelogService productCatelogService = new ProductCatelogServiceImpl();
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> list = productCatelogService.getAllProducts();
		return list;
	}

	@Override
	public Product getProduct(int pid) {
		Product product =productCatelogService.getProduct(pid);
		return product;
	}

	@Override
	public boolean addProduct(String pname, double price) {
		Product product = new Product();
		product.setPname(pname);
		product.setPrice(price);
		productCatelogService.addProduct(product);
		return false;
	}

	@Override
	public boolean updateProduct(int pid, String pname, double price) {
		Product product = new Product(pid, pname, price);
		productCatelogService.updateProduct(product);
		return false;
	}

	@Override
	public boolean deleteProduct(int id) {
		productCatelogService.deleteProduct(id);
		return false;
	}
   
	
}
