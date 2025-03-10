
package Model.Usuario;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "srvUsuario", targetNamespace = "http://Usuario.Service/", wsdlLocation = "http://localhost:8080/WebServices_Infracciones.IntelliJ-1.0-SNAPSHOT/srvUsuario?wsdl")
public class SrvUsuario_Service
    extends Service
{

    private final static URL SRVUSUARIO_WSDL_LOCATION;
    private final static WebServiceException SRVUSUARIO_EXCEPTION;
    private final static QName SRVUSUARIO_QNAME = new QName("http://Usuario.Service/", "srvUsuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WebServices_Infracciones.IntelliJ-1.0-SNAPSHOT/srvUsuario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SRVUSUARIO_WSDL_LOCATION = url;
        SRVUSUARIO_EXCEPTION = e;
    }

    public SrvUsuario_Service() {
        super(__getWsdlLocation(), SRVUSUARIO_QNAME);
    }

    public SrvUsuario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SRVUSUARIO_QNAME, features);
    }

    public SrvUsuario_Service(URL wsdlLocation) {
        super(wsdlLocation, SRVUSUARIO_QNAME);
    }

    public SrvUsuario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SRVUSUARIO_QNAME, features);
    }

    public SrvUsuario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SrvUsuario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SrvUsuario
     */
    @WebEndpoint(name = "srvUsuarioPort")
    public SrvUsuario getSrvUsuarioPort() {
        return super.getPort(new QName("http://Usuario.Service/", "srvUsuarioPort"), SrvUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SrvUsuario
     */
    @WebEndpoint(name = "srvUsuarioPort")
    public SrvUsuario getSrvUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Usuario.Service/", "srvUsuarioPort"), SrvUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SRVUSUARIO_EXCEPTION!= null) {
            throw SRVUSUARIO_EXCEPTION;
        }
        return SRVUSUARIO_WSDL_LOCATION;
    }

}
