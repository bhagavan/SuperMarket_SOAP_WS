package com.vgsc.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.vgsc.model.Products;
import com.vgsc.model.RequestKpi;

@WebService(name = "SupetmarketCatalog", portName = "SuperMarketPort", serviceName = "SupermarketSevice", targetNamespace = "http://vgsconsultancy.com/webservics")
//@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class ProductCatalogImpl {
	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod(action = "ListofProducts", operationName = "getitems")
	public List<String> getProducts() {
		return productService.getProducts();
	}

	@WebMethod
	public boolean addProduct(String productType, String productName) {
		return productService.addProduct(productType, productName);
	}

	@WebMethod
	public List<String> getproductsList(String productName) {
		return productService.getProductsList(productName);
	}

	public List<Products> getProductsv2() {
		return productService.getProductsv2();
	}
	public List<RequestKpi> getReqkpi() {
		try {
			return productService.getReqkpi();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
