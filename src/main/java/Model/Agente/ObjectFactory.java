
package Model.Agente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Agente package. 
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

    private final static QName _ListarAgentes_QNAME = new QName("http://Agente.Service/", "listarAgentes");
    private final static QName _BuscarAgenteResponse_QNAME = new QName("http://Agente.Service/", "buscarAgenteResponse");
    private final static QName _ListarAgentesResponse_QNAME = new QName("http://Agente.Service/", "listarAgentesResponse");
    private final static QName _ActualizarAgente_QNAME = new QName("http://Agente.Service/", "actualizarAgente");
    private final static QName _EliminarAgente_QNAME = new QName("http://Agente.Service/", "eliminarAgente");
    private final static QName _InsertarAgenteResponse_QNAME = new QName("http://Agente.Service/", "insertarAgenteResponse");
    private final static QName _ActualizarAgenteResponse_QNAME = new QName("http://Agente.Service/", "actualizarAgenteResponse");
    private final static QName _InsertarAgente_QNAME = new QName("http://Agente.Service/", "insertarAgente");
    private final static QName _EliminarAgenteResponse_QNAME = new QName("http://Agente.Service/", "eliminarAgenteResponse");
    private final static QName _BuscarAgente_QNAME = new QName("http://Agente.Service/", "buscarAgente");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Agente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarAgentes }
     * 
     */
    public ListarAgentes createListarAgentes() {
        return new ListarAgentes();
    }

    /**
     * Create an instance of {@link BuscarAgenteResponse }
     * 
     */
    public BuscarAgenteResponse createBuscarAgenteResponse() {
        return new BuscarAgenteResponse();
    }

    /**
     * Create an instance of {@link ListarAgentesResponse }
     * 
     */
    public ListarAgentesResponse createListarAgentesResponse() {
        return new ListarAgentesResponse();
    }

    /**
     * Create an instance of {@link ActualizarAgente }
     * 
     */
    public ActualizarAgente createActualizarAgente() {
        return new ActualizarAgente();
    }

    /**
     * Create an instance of {@link EliminarAgente }
     * 
     */
    public EliminarAgente createEliminarAgente() {
        return new EliminarAgente();
    }

    /**
     * Create an instance of {@link InsertarAgenteResponse }
     * 
     */
    public InsertarAgenteResponse createInsertarAgenteResponse() {
        return new InsertarAgenteResponse();
    }

    /**
     * Create an instance of {@link ActualizarAgenteResponse }
     * 
     */
    public ActualizarAgenteResponse createActualizarAgenteResponse() {
        return new ActualizarAgenteResponse();
    }

    /**
     * Create an instance of {@link InsertarAgente }
     * 
     */
    public InsertarAgente createInsertarAgente() {
        return new InsertarAgente();
    }

    /**
     * Create an instance of {@link EliminarAgenteResponse }
     * 
     */
    public EliminarAgenteResponse createEliminarAgenteResponse() {
        return new EliminarAgenteResponse();
    }

    /**
     * Create an instance of {@link BuscarAgente }
     * 
     */
    public BuscarAgente createBuscarAgente() {
        return new BuscarAgente();
    }

    /**
     * Create an instance of {@link Agente }
     * 
     */
    public Agente createAgente() {
        return new Agente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAgentes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "listarAgentes")
    public JAXBElement<ListarAgentes> createListarAgentes(ListarAgentes value) {
        return new JAXBElement<ListarAgentes>(_ListarAgentes_QNAME, ListarAgentes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAgenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "buscarAgenteResponse")
    public JAXBElement<BuscarAgenteResponse> createBuscarAgenteResponse(BuscarAgenteResponse value) {
        return new JAXBElement<BuscarAgenteResponse>(_BuscarAgenteResponse_QNAME, BuscarAgenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarAgentesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "listarAgentesResponse")
    public JAXBElement<ListarAgentesResponse> createListarAgentesResponse(ListarAgentesResponse value) {
        return new JAXBElement<ListarAgentesResponse>(_ListarAgentesResponse_QNAME, ListarAgentesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAgente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "actualizarAgente")
    public JAXBElement<ActualizarAgente> createActualizarAgente(ActualizarAgente value) {
        return new JAXBElement<ActualizarAgente>(_ActualizarAgente_QNAME, ActualizarAgente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAgente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "eliminarAgente")
    public JAXBElement<EliminarAgente> createEliminarAgente(EliminarAgente value) {
        return new JAXBElement<EliminarAgente>(_EliminarAgente_QNAME, EliminarAgente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarAgenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "insertarAgenteResponse")
    public JAXBElement<InsertarAgenteResponse> createInsertarAgenteResponse(InsertarAgenteResponse value) {
        return new JAXBElement<InsertarAgenteResponse>(_InsertarAgenteResponse_QNAME, InsertarAgenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarAgenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "actualizarAgenteResponse")
    public JAXBElement<ActualizarAgenteResponse> createActualizarAgenteResponse(ActualizarAgenteResponse value) {
        return new JAXBElement<ActualizarAgenteResponse>(_ActualizarAgenteResponse_QNAME, ActualizarAgenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarAgente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "insertarAgente")
    public JAXBElement<InsertarAgente> createInsertarAgente(InsertarAgente value) {
        return new JAXBElement<InsertarAgente>(_InsertarAgente_QNAME, InsertarAgente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarAgenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "eliminarAgenteResponse")
    public JAXBElement<EliminarAgenteResponse> createEliminarAgenteResponse(EliminarAgenteResponse value) {
        return new JAXBElement<EliminarAgenteResponse>(_EliminarAgenteResponse_QNAME, EliminarAgenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarAgente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Agente.Service/", name = "buscarAgente")
    public JAXBElement<BuscarAgente> createBuscarAgente(BuscarAgente value) {
        return new JAXBElement<BuscarAgente>(_BuscarAgente_QNAME, BuscarAgente.class, null, value);
    }

}
