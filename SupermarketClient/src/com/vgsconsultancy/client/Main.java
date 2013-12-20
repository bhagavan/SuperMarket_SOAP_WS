package com.vgsconsultancy.client;

import java.util.List;

import com.vgsconsultancy.webservics.RequestKpi;
import com.vgsconsultancy.webservics.SupermarketSevice;
import com.vgsconsultancy.webservics.SupetmarketCatalog;

public class Main {
	public static void main(String[] args) {
		SupermarketSevice supermarketService = new SupermarketSevice();
		SupetmarketCatalog supermarketCatlog=supermarketService.getSuperMarketPort();
				List<RequestKpi> reqkpi=supermarketCatlog.getReqkpi();
				for (RequestKpi r:reqkpi )
				{
					System.out.println("----------------------------------------------------------------");
					System.out.print(r.getCNAR()+" ");
					System.out.print(r.getFromNumber()+" ");
					System.out.print(r.getMOS()+" ");
					System.out.print(r.getMOU()+" ");
					System.out.print(r.getNetwork()+" ");
					System.out.print(r.getNetworkDevice()+" ");
					System.out.print(r.getOriginatingNetwork()+" ");
					System.out.print(r.getSDF()+" ");
					System.out.print(r.getSEER()+" ");
					System.out.print(r.getSER()+" ");
					System.out.print(r.getStatus()+" ");
					System.out.print(r.getTerminatingNetwork()+" ");
					System.out.print(r.getProductTime()+" ");
					System.out.println(r.getToNumber()+" ");


				}
	}

}
