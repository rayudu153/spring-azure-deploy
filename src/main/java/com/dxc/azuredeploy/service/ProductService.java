package com.dxc.azuredeploy.service;

import java.util.List;

import com.dxc.azuredeploy.entity.Product;

public interface ProductService {


	    Product saveProduct(Product product);
	    List<Product> getProducts();
	    Product getProductById(int id);
	    Product getProductByName(String name);
	    String deleteProduct(int id);
	    Product updateProduct(Product product);


}
