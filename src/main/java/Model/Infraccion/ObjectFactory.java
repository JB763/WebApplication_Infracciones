
package Model.Infraccion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Infraccion package. 
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

    private final static QName _ActualizarInfraccionResponse_QNAME = new QName("http://Infraccion.Service/", "actualizarInfraccionResponse");
    private final static QName _InsertarInfraccionResponse_QNAME = new QName("http://Infraccion.Service/", "insertarInfraccionResponse");
    private final static QName _InsertarInfraccion_QNAME = new QName("http://Infraccion.Service/", "insertarInfraccion");
    private final static QName _ActualizarInfraccion_QNAME = new QName("http://Infraccion.Service/", "actualizarInfraccion");
    private final static QName _EliminarInfraccionResponse_QNAME = new QName("http://Infraccion.Service/", "eliminarInfraccionResponse");
    private final static QName _BuscarInfraccion_QNAME = new QName("http://Infraccion.Service/", "buscarInfraccion");
    private final static QName _BuscarInfraccionResponse_QNAME = new QName("http://Infraccion.Service/", "buscarInfraccionResponse");
    private final static QName _ListarInfraccionesResponse_QNAME = new QName("http://Infraccion.Service/", "listarInfraccionesResponse");
    private final static QName _EliminarInfraccion_QNAME = new QName("http://Infraccion.Service/", "eliminarInfraccion");
    private final static QName _ListarInfracciones_QNAME = new QName("http://Infraccion.Service/", "listarInfracciones");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Infraccion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarInfraccion }
     * 
     */
    public InsertarInfraccion createInsertarInfraccion() {
        return new InsertarInfraccion();
    }

    /**
     * Create an instance of {@link InsertarInfraccionResponse }
     * 
     */
    public InsertarInfraccionResponse createInsertarInfraccionResponse() {
        return new InsertarInfraccionResponse();
    }

    /**
     * Create an instance of {@link ActualizarInfraccionResponse }
     * 
     */
    public ActualizarInfraccionResponse createActualizarInfraccionResponse() {
        return new ActualizarInfraccionResponse();
    }

    /**
     * Create an instance of {@link ListarInfracciones }
     * 
     */
    public ListarInfracciones createListarInfracciones() {
        return new ListarInfracciones();
    }

    /**
     * Create an instance of {@link EliminarInfraccion }
     * 
     */
    public EliminarInfraccion createEliminarInfraccion() {
        return new EliminarInfraccion();
    }

    /**
     * Create an instance of {@link BuscarInfraccion }
     * 
     */
    public BuscarInfraccion createBuscarInfraccion() {
        return new BuscarInfraccion();
    }

    /**
     * Create an instance of {@link BuscarInfraccionResponse }
     * 
     */
    public BuscarInfraccionResponse createBuscarInfraccionResponse() {
        return new BuscarInfraccionResponse();
    }

    /**
     * Create an instance of {@link ListarInfraccionesResponse }
     * 
     */
    public ListarInfraccionesResponse createListarInfraccionesResponse() {
        return new ListarInfraccionesResponse();
    }

    /**
     * Create an instance of {@link ActualizarInfraccion }
     * 
     */
    public ActualizarInfraccion createActualizarInfraccion() {
        return new ActualizarInfraccion();
    }

    /**
     * Create an instance of {@link EliminarInfraccionResponse }
     * 
     */
    public EliminarInfraccionResponse createEliminarInfraccionResponse() {
        return new EliminarInfraccionResponse();
    }

    /**
     * Create an instance of {@link Infraccion }
     * 
     */
    public Infraccion createInfraccion() {
        return new Infraccion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarInfraccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "actualizarInfraccionResponse")
    public JAXBElement<ActualizarInfraccionResponse> createActualizarInfraccionResponse(ActualizarInfraccionResponse value) {
        return new JAXBElement<ActualizarInfraccionResponse>(_ActualizarInfraccionResponse_QNAME, ActualizarInfraccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarInfraccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "insertarInfraccionResponse")
    public JAXBElement<InsertarInfraccionResponse> createInsertarInfraccionResponse(InsertarInfraccionResponse value) {
        return new JAXBElement<InsertarInfraccionResponse>(_InsertarInfraccionResponse_QNAME, InsertarInfraccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarInfraccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "insertarInfraccion")
    public JAXBElement<InsertarInfraccion> createInsertarInfraccion(InsertarInfraccion value) {
        return new JAXBElement<InsertarInfraccion>(_InsertarInfraccion_QNAME, InsertarInfraccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarInfraccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "actualizarInfraccion")
    public JAXBElement<ActualizarInfraccion> createActualizarInfraccion(ActualizarInfraccion value) {
        return new JAXBElement<ActualizarInfraccion>(_ActualizarInfraccion_QNAME, ActualizarInfraccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarInfraccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "eliminarInfraccionResponse")
    public JAXBElement<EliminarInfraccionResponse> createEliminarInfraccionResponse(EliminarInfraccionResponse value) {
        return new JAXBElement<EliminarInfraccionResponse>(_EliminarInfraccionResponse_QNAME, EliminarInfraccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarInfraccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "buscarInfraccion")
    public JAXBElement<BuscarInfraccion> createBuscarInfraccion(BuscarInfraccion value) {
        return new JAXBElement<BuscarInfraccion>(_BuscarInfraccion_QNAME, BuscarInfraccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarInfraccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "buscarInfraccionResponse")
    public JAXBElement<BuscarInfraccionResponse> createBuscarInfraccionResponse(BuscarInfraccionResponse value) {
        return new JAXBElement<BuscarInfraccionResponse>(_BuscarInfraccionResponse_QNAME, BuscarInfraccionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInfraccionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "listarInfraccionesResponse")
    public JAXBElement<ListarInfraccionesResponse> createListarInfraccionesResponse(ListarInfraccionesResponse value) {
        return new JAXBElement<ListarInfraccionesResponse>(_ListarInfraccionesResponse_QNAME, ListarInfraccionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarInfraccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "eliminarInfraccion")
    public JAXBElement<EliminarInfraccion> createEliminarInfraccion(EliminarInfraccion value) {
        return new JAXBElement<EliminarInfraccion>(_EliminarInfraccion_QNAME, EliminarInfraccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInfracciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Infraccion.Service/", name = "listarInfracciones")
    public JAXBElement<ListarInfracciones> createListarInfracciones(ListarInfracciones value) {
        return new JAXBElement<ListarInfracciones>(_ListarInfracciones_QNAME, ListarInfracciones.class, null, value);
    }

}
