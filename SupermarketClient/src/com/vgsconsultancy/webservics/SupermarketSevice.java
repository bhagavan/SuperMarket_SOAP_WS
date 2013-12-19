
package com.vgsconsultancy.webservics;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SupermarketSevice", targetNamespace = "http://vgsconsultancy.com/webservics", wsdlLocation = "http://vgsc-pc:8080/SuperMarketAppWS/SupermarketSevice?wsdl")
public class SupermarketSevice
    extends Service
{

    private final static URL SUPERMARKETSEVICE_WSDL_LOCATION;
    private final static WebServiceException SUPERMARKETSEVICE_EXCEPTION;
    private final static QName SUPERMARKETSEVICE_QNAME = new QName("http://vgsconsultancy.com/webservics", "SupermarketSevice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vgsc-pc:8080/SuperMarketAppWS/SupermarketSevice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUPERMARKETSEVICE_WSDL_LOCATION = url;
        SUPERMARKETSEVICE_EXCEPTION = e;
    }

    public SupermarketSevice() {
        super(__getWsdlLocation(), SUPERMARKETSEVICE_QNAME);
    }

    public SupermarketSevice(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUPERMARKETSEVICE_QNAME, features);
    }

    public SupermarketSevice(URL wsdlLocation) {
        super(wsdlLocation, SUPERMARKETSEVICE_QNAME);
    }

    public SupermarketSevice(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUPERMARKETSEVICE_QNAME, features);
    }

    public SupermarketSevice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SupermarketSevice(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SupetmarketCatalog
     */
    @WebEndpoint(name = "SuperMarketPort")
    public SupetmarketCatalog getSuperMarketPort() {
        return super.getPort(new QName("http://vgsconsultancy.com/webservics", "SuperMarketPort"), SupetmarketCatalog.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SupetmarketCatalog
     */
    @WebEndpoint(name = "SuperMarketPort")
    public SupetmarketCatalog getSuperMarketPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://vgsconsultancy.com/webservics", "SuperMarketPort"), SupetmarketCatalog.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUPERMARKETSEVICE_EXCEPTION!= null) {
            throw SUPERMARKETSEVICE_EXCEPTION;
        }
        return SUPERMARKETSEVICE_WSDL_LOCATION;
    }

}