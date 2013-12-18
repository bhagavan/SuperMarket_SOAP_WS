package com.vgsc.webservice;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class ShopInfo {

	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String query) {
		String Response = "Invalid ";
		if ("shopinfo".equals(query))

			Response = "Super market";
		else if ("since".equals(query))

			Response = "1003";

		return Response;

	}

}
