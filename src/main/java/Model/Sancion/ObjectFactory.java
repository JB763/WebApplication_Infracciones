
package Model.Sancion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Sancion package. 
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

    private final static QName _InsertarSancion_QNAME = new QName("http://Sancion.Service/", "insertarSancion");
    private final static QName _BuscarSancionResponse_QNAME = new QName("http://Sancion.Service/", "buscarSancionResponse");
    private final static QName _ActualizarSancionResponse_QNAME = new QName("http://Sancion.Service/", "actualizarSancionResponse");
    private final static QName _BuscarSancion_QNAME = new QName("http://Sancion.Service/", "buscarSancion");
    private final static QName _InsertarSancionResponse_QNAME = new QName("http://Sancion.Service/", "insertarSancionResponse");
    private final static QName _ListarSancionesResponse_QNAME = new QName("http://Sancion.Service/", "listarSancionesResponse");
    private final static QName _ActualizarSancion_QNAME = new QName("http://Sancion.Service/", "actualizarSancion");
    private final static QName _EliminarSancionResponse_QNAME = new QName("http://Sancion.Service/", "eliminarSancionResponse");
    private final static QName _EliminarSancion_QNAME = new QName("http://Sancion.Service/", "eliminarSancion");
    private final static QName _ListarSanciones_QNAME = new QName("http://Sancion.Service/", "listarSanciones");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Sancion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarSancion }
     * 
     */
    public InsertarSancion createInsertarSancion() {
        return new InsertarSancion();
    }

    /**
     * Create an instance of {@link BuscarSancionResponse }
     * 
     */
    public BuscarSancionResponse createBuscarSancionResponse() {
        return new BuscarSancionResponse();
    }

    /**
     * Create an instance of {@link InsertarSancionResponse }
     * 
     */
    public InsertarSancionResponse createInsertarSancionResponse() {
        return new InsertarSancionResponse();
    }

    /**
     * Create an instance of {@link ActualizarSancionResponse }
     * 
     */
    public ActualizarSancionResponse createActualizarSancionResponse() {
        return new ActualizarSancionResponse();
    }

    /**
     * Create an instance of {@link BuscarSancion }
     * 
     */
    public BuscarSancion createBuscarSancion() {
        return new BuscarSancion();
    }

    /**
     * Create an instance of {@link ActualizarSancion }
     * 
     */
    public ActualizarSancion createActualizarSancion() {
        return new ActualizarSancion();
    }

    /**
     * Create an instance of {@link EliminarSancionResponse }
     * 
     */
    public EliminarSancionResponse createEliminarSancionResponse() {
        return new EliminarSancionResponse();
    }

    /**
     * Create an instance of {@link ListarSancionesResponse }
     * 
     */
    public ListarSancionesResponse createListarSancionesResponse() {
        return new ListarSancionesResponse();
    }

    /**
     * Create an instance of {@link ListarSanciones }
     * 
     */
    public ListarSanciones createListarSanciones() {
        return new ListarSanciones();
    }

    /**
     * Create an instance of {@link EliminarSancion }
     * 
     */
    public EliminarSancion createEliminarSancion() {
        return new EliminarSancion();
    }

    /**
     * Create an instance of {@link Sancion }
     * 
     */
    public Sancion createSancion() {
        return new Sancion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarSancion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "insertarSancion")
    public JAXBElement<InsertarSancion> createInsertarSancion(InsertarSancion value) {
        return new JAXBElement<InsertarSancion>(_InsertarSancion_QNAME, InsertarSancion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSancionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "buscarSancionResponse")
    public JAXBElement<BuscarSancionResponse> createBuscarSancionResponse(BuscarSancionResponse value) {
        return new JAXBElement<BuscarSancionResponse>(_BuscarSancionResponse_QNAME, BuscarSancionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSancionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "actualizarSancionResponse")
    public JAXBElement<ActualizarSancionResponse> createActualizarSancionResponse(ActualizarSancionResponse value) {
        return new JAXBElement<ActualizarSancionResponse>(_ActualizarSancionResponse_QNAME, ActualizarSancionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSancion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "buscarSancion")
    public JAXBElement<BuscarSancion> createBuscarSancion(BuscarSancion value) {
        return new JAXBElement<BuscarSancion>(_BuscarSancion_QNAME, BuscarSancion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarSancionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "insertarSancionResponse")
    public JAXBElement<InsertarSancionResponse> createInsertarSancionResponse(InsertarSancionResponse value) {
        return new JAXBElement<InsertarSancionResponse>(_InsertarSancionResponse_QNAME, InsertarSancionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSancionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "listarSancionesResponse")
    public JAXBElement<ListarSancionesResponse> createListarSancionesResponse(ListarSancionesResponse value) {
        return new JAXBElement<ListarSancionesResponse>(_ListarSancionesResponse_QNAME, ListarSancionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSancion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "actualizarSancion")
    public JAXBElement<ActualizarSancion> createActualizarSancion(ActualizarSancion value) {
        return new JAXBElement<ActualizarSancion>(_ActualizarSancion_QNAME, ActualizarSancion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSancionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "eliminarSancionResponse")
    public JAXBElement<EliminarSancionResponse> createEliminarSancionResponse(EliminarSancionResponse value) {
        return new JAXBElement<EliminarSancionResponse>(_EliminarSancionResponse_QNAME, EliminarSancionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSancion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "eliminarSancion")
    public JAXBElement<EliminarSancion> createEliminarSancion(EliminarSancion value) {
        return new JAXBElement<EliminarSancion>(_EliminarSancion_QNAME, EliminarSancion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSanciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Sancion.Service/", name = "listarSanciones")
    public JAXBElement<ListarSanciones> createListarSanciones(ListarSanciones value) {
        return new JAXBElement<ListarSanciones>(_ListarSanciones_QNAME, ListarSanciones.class, null, value);
    }

}
