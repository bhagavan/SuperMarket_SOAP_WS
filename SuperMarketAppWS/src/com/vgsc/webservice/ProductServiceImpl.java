package com.vgsc.webservice;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;

import com.vgsc.dao.Database;
import com.vgsc.dao.ServiceDAO;
import com.vgsc.model.Products;
import com.vgsc.model.RequestKpi;

public class ProductServiceImpl {

	public List<String> arrayList = new ArrayList<>();
	public List<String> booksList = new ArrayList<>();
	public List<String> pensList = new ArrayList<>();
	public List<String> laptopsList = new ArrayList<>();

	public ProductServiceImpl() {
		pensList.add("Rynolds");
		pensList.add("Parcker");
		pensList.add("Gel");

		booksList.add("alchemist");
		booksList.add("3 mistakes");
		booksList.add("frankfurt");

		laptopsList.add("Lenovo");
		laptopsList.add("Dell");
		laptopsList.add("hp");

	}

	public List<String> getProducts() {
		arrayList.add("books");
		arrayList.add("Pens");
		arrayList.add("Laptops");
		return arrayList;
	}

	public boolean addProduct(String productType, String productName) {

		switch (productType) {
		case "books":
			booksList.add(productName);
			break;
		case "Pens":
			pensList.add(productName);
			break;
		case "Laptops":
			laptopsList.add(productName);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<String> getProductsList(String productName) {
		switch (productName) {
		case "books":
			return booksList;

		case "pens":
			return pensList;

		case "Laptops":
			return laptopsList;

		}
		return null;
	}

	public List<Products> getProductsv2() {
		List<Products> productList = new ArrayList<>();
		productList.add(new Products("java brains", "koushic", 99));
		productList.add(new Products("java ", "bhagavan", 100));

		return productList;
	}
	@WebMethod
	@WebResult(name="RequestKpi")
	public List<RequestKpi> getReqkpi() throws Exception {
		List<RequestKpi> kpiList = new ArrayList<>();
		Database db = new Database();
		Connection conn = db.get_Connection();
		ServiceDAO serviceDAO = new ServiceDAO();
		kpiList = serviceDAO.getReqKPI(conn);
		return kpiList;
	}

}
