
package com.vgsconsultancy.webservics;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vgsconsultancy.webservics package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetReqkpiResponse_QNAME = new QName("http://vgsconsultancy.com/webservics", "getReqkpiResponse");
    private final static QName _GetProductsv2_QNAME = new QName("http://vgsconsultancy.com/webservics", "getProductsv2");
    private final static QName _AddProduct_QNAME = new QName("http://vgsconsultancy.com/webservics", "addProduct");
    private final static QName _Getitems_QNAME = new QName("http://vgsconsultancy.com/webservics", "getitems");
    private final static QName _ProductName_QNAME = new QName("http://vgsconsultancy.com/webservics", "ProductName");
    private final static QName _GetProductsv2Response_QNAME = new QName("http://vgsconsultancy.com/webservics", "getProductsv2Response");
    private final static QName _GetproductsList_QNAME = new QName("http://vgsconsultancy.com/webservics", "getproductsList");
    private final static QName _GetReqkpi_QNAME = new QName("http://vgsconsultancy.com/webservics", "getReqkpi");
    private final static QName _AddProductResponse_QNAME = new QName("http://vgsconsultancy.com/webservics", "addProductResponse");
    private final static QName _GetitemsResponse_QNAME = new QName("http://vgsconsultancy.com/webservics", "getitemsResponse");
    private final static QName _GetproductsListResponse_QNAME = new QName("http://vgsconsultancy.com/webservics", "getproductsListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vgsconsultancy.webservics
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReqkpiResponse }
     * 
     */
    public GetReqkpiResponse createGetReqkpiResponse() {
        return new GetReqkpiResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetProductsv2 }
     * 
     */
    public GetProductsv2 createGetProductsv2() {
        return new GetProductsv2();
    }

    /**
     * Create an instance of {@link GetReqkpi }
     * 
     */
    public GetReqkpi createGetReqkpi() {
        return new GetReqkpi();
    }

    /**
     * Create an instance of {@link GetproductsList }
     * 
     */
    public GetproductsList createGetproductsList() {
        return new GetproductsList();
    }

    /**
     * Create an instance of {@link GetProductsv2Response }
     * 
     */
    public GetProductsv2Response createGetProductsv2Response() {
        return new GetProductsv2Response();
    }

    /**
     * Create an instance of {@link RequestKpi }
     * 
     */
    public RequestKpi createRequestKpi() {
        return new RequestKpi();
    }

    /**
     * Create an instance of {@link Getitems }
     * 
     */
    public Getitems createGetitems() {
        return new Getitems();
    }

    /**
     * Create an instance of {@link GetproductsListResponse }
     * 
     */
    public GetproductsListResponse createGetproductsListResponse() {
        return new GetproductsListResponse();
    }

    /**
     * Create an instance of {@link GetitemsResponse }
     * 
     */
    public GetitemsResponse createGetitemsResponse() {
        return new GetitemsResponse();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReqkpiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getReqkpiResponse")
    public JAXBElement<GetReqkpiResponse> createGetReqkpiResponse(GetReqkpiResponse value) {
        return new JAXBElement<GetReqkpiResponse>(_GetReqkpiResponse_QNAME, GetReqkpiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getProductsv2")
    public JAXBElement<GetProductsv2> createGetProductsv2(GetProductsv2 value) {
        return new JAXBElement<GetProductsv2>(_GetProductsv2_QNAME, GetProductsv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getitems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getitems")
    public JAXBElement<Getitems> createGetitems(Getitems value) {
        return new JAXBElement<Getitems>(_Getitems_QNAME, Getitems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestKpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "ProductName")
    public JAXBElement<RequestKpi> createProductName(RequestKpi value) {
        return new JAXBElement<RequestKpi>(_ProductName_QNAME, RequestKpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getProductsv2Response")
    public JAXBElement<GetProductsv2Response> createGetProductsv2Response(GetProductsv2Response value) {
        return new JAXBElement<GetProductsv2Response>(_GetProductsv2Response_QNAME, GetProductsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetproductsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getproductsList")
    public JAXBElement<GetproductsList> createGetproductsList(GetproductsList value) {
        return new JAXBElement<GetproductsList>(_GetproductsList_QNAME, GetproductsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReqkpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getReqkpi")
    public JAXBElement<GetReqkpi> createGetReqkpi(GetReqkpi value) {
        return new JAXBElement<GetReqkpi>(_GetReqkpi_QNAME, GetReqkpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetitemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getitemsResponse")
    public JAXBElement<GetitemsResponse> createGetitemsResponse(GetitemsResponse value) {
        return new JAXBElement<GetitemsResponse>(_GetitemsResponse_QNAME, GetitemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetproductsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vgsconsultancy.com/webservics", name = "getproductsListResponse")
    public JAXBElement<GetproductsListResponse> createGetproductsListResponse(GetproductsListResponse value) {
        return new JAXBElement<GetproductsListResponse>(_GetproductsListResponse_QNAME, GetproductsListResponse.class, null, value);
    }

}
