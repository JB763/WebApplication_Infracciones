
package Model.Pago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Pago package. 
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

    private final static QName _ActualizarPagoResponse_QNAME = new QName("http://Pago.Service/", "actualizarPagoResponse");
    private final static QName _InsertarPago_QNAME = new QName("http://Pago.Service/", "insertarPago");
    private final static QName _InsertarPagoResponse_QNAME = new QName("http://Pago.Service/", "insertarPagoResponse");
    private final static QName _ActualizarPago_QNAME = new QName("http://Pago.Service/", "actualizarPago");
    private final static QName _BuscarPago_QNAME = new QName("http://Pago.Service/", "buscarPago");
    private final static QName _ListarPagoResponse_QNAME = new QName("http://Pago.Service/", "listarPagoResponse");
    private final static QName _BuscarPagoResponse_QNAME = new QName("http://Pago.Service/", "buscarPagoResponse");
    private final static QName _EliminarPagoResponse_QNAME = new QName("http://Pago.Service/", "eliminarPagoResponse");
    private final static QName _ListarPago_QNAME = new QName("http://Pago.Service/", "listarPago");
    private final static QName _EliminarPago_QNAME = new QName("http://Pago.Service/", "eliminarPago");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Pago
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPago }
     * 
     */
    public ListarPago createListarPago() {
        return new ListarPago();
    }

    /**
     * Create an instance of {@link EliminarPago }
     * 
     */
    public EliminarPago createEliminarPago() {
        return new EliminarPago();
    }

    /**
     * Create an instance of {@link InsertarPagoResponse }
     * 
     */
    public InsertarPagoResponse createInsertarPagoResponse() {
        return new InsertarPagoResponse();
    }

    /**
     * Create an instance of {@link ActualizarPagoResponse }
     * 
     */
    public ActualizarPagoResponse createActualizarPagoResponse() {
        return new ActualizarPagoResponse();
    }

    /**
     * Create an instance of {@link InsertarPago }
     * 
     */
    public InsertarPago createInsertarPago() {
        return new InsertarPago();
    }

    /**
     * Create an instance of {@link ActualizarPago }
     * 
     */
    public ActualizarPago createActualizarPago() {
        return new ActualizarPago();
    }

    /**
     * Create an instance of {@link BuscarPago }
     * 
     */
    public BuscarPago createBuscarPago() {
        return new BuscarPago();
    }

    /**
     * Create an instance of {@link ListarPagoResponse }
     * 
     */
    public ListarPagoResponse createListarPagoResponse() {
        return new ListarPagoResponse();
    }

    /**
     * Create an instance of {@link EliminarPagoResponse }
     * 
     */
    public EliminarPagoResponse createEliminarPagoResponse() {
        return new EliminarPagoResponse();
    }

    /**
     * Create an instance of {@link BuscarPagoResponse }
     * 
     */
    public BuscarPagoResponse createBuscarPagoResponse() {
        return new BuscarPagoResponse();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createPago() {
        return new Pago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "actualizarPagoResponse")
    public JAXBElement<ActualizarPagoResponse> createActualizarPagoResponse(ActualizarPagoResponse value) {
        return new JAXBElement<ActualizarPagoResponse>(_ActualizarPagoResponse_QNAME, ActualizarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "insertarPago")
    public JAXBElement<InsertarPago> createInsertarPago(InsertarPago value) {
        return new JAXBElement<InsertarPago>(_InsertarPago_QNAME, InsertarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "insertarPagoResponse")
    public JAXBElement<InsertarPagoResponse> createInsertarPagoResponse(InsertarPagoResponse value) {
        return new JAXBElement<InsertarPagoResponse>(_InsertarPagoResponse_QNAME, InsertarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "actualizarPago")
    public JAXBElement<ActualizarPago> createActualizarPago(ActualizarPago value) {
        return new JAXBElement<ActualizarPago>(_ActualizarPago_QNAME, ActualizarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "buscarPago")
    public JAXBElement<BuscarPago> createBuscarPago(BuscarPago value) {
        return new JAXBElement<BuscarPago>(_BuscarPago_QNAME, BuscarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "listarPagoResponse")
    public JAXBElement<ListarPagoResponse> createListarPagoResponse(ListarPagoResponse value) {
        return new JAXBElement<ListarPagoResponse>(_ListarPagoResponse_QNAME, ListarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "buscarPagoResponse")
    public JAXBElement<BuscarPagoResponse> createBuscarPagoResponse(BuscarPagoResponse value) {
        return new JAXBElement<BuscarPagoResponse>(_BuscarPagoResponse_QNAME, BuscarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "eliminarPagoResponse")
    public JAXBElement<EliminarPagoResponse> createEliminarPagoResponse(EliminarPagoResponse value) {
        return new JAXBElement<EliminarPagoResponse>(_EliminarPagoResponse_QNAME, EliminarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "listarPago")
    public JAXBElement<ListarPago> createListarPago(ListarPago value) {
        return new JAXBElement<ListarPago>(_ListarPago_QNAME, ListarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Pago.Service/", name = "eliminarPago")
    public JAXBElement<EliminarPago> createEliminarPago(EliminarPago value) {
        return new JAXBElement<EliminarPago>(_EliminarPago_QNAME, EliminarPago.class, null, value);
    }

}
