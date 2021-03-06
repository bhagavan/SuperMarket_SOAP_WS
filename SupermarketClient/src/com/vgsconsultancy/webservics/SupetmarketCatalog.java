
package com.vgsconsultancy.webservics;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SupetmarketCatalog", targetNamespace = "http://vgsconsultancy.com/webservics")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SupetmarketCatalog {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getproductsList", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetproductsList")
    @ResponseWrapper(localName = "getproductsListResponse", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetproductsListResponse")
    @Action(input = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getproductsListRequest", output = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getproductsListResponse")
    public List<String> getproductsList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(action = "ListofProducts")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getitems", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.Getitems")
    @ResponseWrapper(localName = "getitemsResponse", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetitemsResponse")
    @Action(input = "ListofProducts", output = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getitemsResponse")
    public List<String> getitems();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.AddProductResponse")
    @Action(input = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/addProductRequest", output = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/addProductResponse")
    public boolean addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<com.vgsconsultancy.webservics.Products>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductsv2", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetProductsv2")
    @ResponseWrapper(localName = "getProductsv2Response", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetProductsv2Response")
    @Action(input = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getProductsv2Request", output = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getProductsv2Response")
    public List<Products> getProductsv2();

    /**
     * 
     * @return
     *     returns java.util.List<com.vgsconsultancy.webservics.RequestKpi>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getReqkpi", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetReqkpi")
    @ResponseWrapper(localName = "getReqkpiResponse", targetNamespace = "http://vgsconsultancy.com/webservics", className = "com.vgsconsultancy.webservics.GetReqkpiResponse")
    @Action(input = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getReqkpiRequest", output = "http://vgsconsultancy.com/webservics/SupetmarketCatalog/getReqkpiResponse")
    public List<RequestKpi> getReqkpi();

}
