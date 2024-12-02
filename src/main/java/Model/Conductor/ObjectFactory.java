
package Model.Conductor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Conductor package. 
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

    private final static QName _ListarConductoresResponse_QNAME = new QName("http://Conductor.Service/", "listarConductoresResponse");
    private final static QName _ListarConductores_QNAME = new QName("http://Conductor.Service/", "listarConductores");
    private final static QName _InsertarConductorResponse_QNAME = new QName("http://Conductor.Service/", "insertarConductorResponse");
    private final static QName _EliminarConductorResponse_QNAME = new QName("http://Conductor.Service/", "eliminarConductorResponse");
    private final static QName _ActualizarConductor_QNAME = new QName("http://Conductor.Service/", "actualizarConductor");
    private final static QName _InsertarConductor_QNAME = new QName("http://Conductor.Service/", "insertarConductor");
    private final static QName _EliminarConductor_QNAME = new QName("http://Conductor.Service/", "eliminarConductor");
    private final static QName _BuscarConductor_QNAME = new QName("http://Conductor.Service/", "buscarConductor");
    private final static QName _BuscarConductorResponse_QNAME = new QName("http://Conductor.Service/", "buscarConductorResponse");
    private final static QName _ActualizarConductorResponse_QNAME = new QName("http://Conductor.Service/", "actualizarConductorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Conductor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarConductor }
     * 
     */
    public BuscarConductor createBuscarConductor() {
        return new BuscarConductor();
    }

    /**
     * Create an instance of {@link BuscarConductorResponse }
     * 
     */
    public BuscarConductorResponse createBuscarConductorResponse() {
        return new BuscarConductorResponse();
    }

    /**
     * Create an instance of {@link EliminarConductor }
     * 
     */
    public EliminarConductor createEliminarConductor() {
        return new EliminarConductor();
    }

    /**
     * Create an instance of {@link ActualizarConductorResponse }
     * 
     */
    public ActualizarConductorResponse createActualizarConductorResponse() {
        return new ActualizarConductorResponse();
    }

    /**
     * Create an instance of {@link EliminarConductorResponse }
     * 
     */
    public EliminarConductorResponse createEliminarConductorResponse() {
        return new EliminarConductorResponse();
    }

    /**
     * Create an instance of {@link InsertarConductor }
     * 
     */
    public InsertarConductor createInsertarConductor() {
        return new InsertarConductor();
    }

    /**
     * Create an instance of {@link ActualizarConductor }
     * 
     */
    public ActualizarConductor createActualizarConductor() {
        return new ActualizarConductor();
    }

    /**
     * Create an instance of {@link ListarConductores }
     * 
     */
    public ListarConductores createListarConductores() {
        return new ListarConductores();
    }

    /**
     * Create an instance of {@link ListarConductoresResponse }
     * 
     */
    public ListarConductoresResponse createListarConductoresResponse() {
        return new ListarConductoresResponse();
    }

    /**
     * Create an instance of {@link InsertarConductorResponse }
     * 
     */
    public InsertarConductorResponse createInsertarConductorResponse() {
        return new InsertarConductorResponse();
    }

    /**
     * Create an instance of {@link Conductor }
     * 
     */
    public Conductor createConductor() {
        return new Conductor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConductoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "listarConductoresResponse")
    public JAXBElement<ListarConductoresResponse> createListarConductoresResponse(ListarConductoresResponse value) {
        return new JAXBElement<ListarConductoresResponse>(_ListarConductoresResponse_QNAME, ListarConductoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConductores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "listarConductores")
    public JAXBElement<ListarConductores> createListarConductores(ListarConductores value) {
        return new JAXBElement<ListarConductores>(_ListarConductores_QNAME, ListarConductores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarConductorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "insertarConductorResponse")
    public JAXBElement<InsertarConductorResponse> createInsertarConductorResponse(InsertarConductorResponse value) {
        return new JAXBElement<InsertarConductorResponse>(_InsertarConductorResponse_QNAME, InsertarConductorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConductorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "eliminarConductorResponse")
    public JAXBElement<EliminarConductorResponse> createEliminarConductorResponse(EliminarConductorResponse value) {
        return new JAXBElement<EliminarConductorResponse>(_EliminarConductorResponse_QNAME, EliminarConductorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarConductor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "actualizarConductor")
    public JAXBElement<ActualizarConductor> createActualizarConductor(ActualizarConductor value) {
        return new JAXBElement<ActualizarConductor>(_ActualizarConductor_QNAME, ActualizarConductor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarConductor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "insertarConductor")
    public JAXBElement<InsertarConductor> createInsertarConductor(InsertarConductor value) {
        return new JAXBElement<InsertarConductor>(_InsertarConductor_QNAME, InsertarConductor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarConductor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "eliminarConductor")
    public JAXBElement<EliminarConductor> createEliminarConductor(EliminarConductor value) {
        return new JAXBElement<EliminarConductor>(_EliminarConductor_QNAME, EliminarConductor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarConductor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "buscarConductor")
    public JAXBElement<BuscarConductor> createBuscarConductor(BuscarConductor value) {
        return new JAXBElement<BuscarConductor>(_BuscarConductor_QNAME, BuscarConductor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarConductorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "buscarConductorResponse")
    public JAXBElement<BuscarConductorResponse> createBuscarConductorResponse(BuscarConductorResponse value) {
        return new JAXBElement<BuscarConductorResponse>(_BuscarConductorResponse_QNAME, BuscarConductorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarConductorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Conductor.Service/", name = "actualizarConductorResponse")
    public JAXBElement<ActualizarConductorResponse> createActualizarConductorResponse(ActualizarConductorResponse value) {
        return new JAXBElement<ActualizarConductorResponse>(_ActualizarConductorResponse_QNAME, ActualizarConductorResponse.class, null, value);
    }

}
