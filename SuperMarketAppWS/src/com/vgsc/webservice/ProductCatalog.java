package com.vgsc.webservice;

import java.util.List;

import javax.jws.WebMethod;

import com.vgsc.model.Products;
import com.vgsc.model.RequestKpi;

public interface ProductCatalog {

	public abstract List<String> getProducts();

	public abstract boolean addProduct(String productType, String productName);

	public abstract List<String> getproductsList(String productName);

	public abstract List<Products> getProductsv2();

	public abstract List<RequestKpi> getReqkpi();

}