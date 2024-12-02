
package Model.Vehiculo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Vehiculo package. 
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

    private final static QName _BuscarVehiculoResponse_QNAME = new QName("http://Vehiculo.Service/", "buscarVehiculoResponse");
    private final static QName _ListarVehiculos_QNAME = new QName("http://Vehiculo.Service/", "listarVehiculos");
    private final static QName _InsertarVehiculo_QNAME = new QName("http://Vehiculo.Service/", "insertarVehiculo");
    private final static QName _ListarVehiculosResponse_QNAME = new QName("http://Vehiculo.Service/", "listarVehiculosResponse");
    private final static QName _InsertarVehiculoResponse_QNAME = new QName("http://Vehiculo.Service/", "insertarVehiculoResponse");
    private final static QName _BuscarVehiculo_QNAME = new QName("http://Vehiculo.Service/", "buscarVehiculo");
    private final static QName _ActualizarVehiculoResponse_QNAME = new QName("http://Vehiculo.Service/", "actualizarVehiculoResponse");
    private final static QName _EliminarVehiculoResponse_QNAME = new QName("http://Vehiculo.Service/", "eliminarVehiculoResponse");
    private final static QName _EliminarVehiculo_QNAME = new QName("http://Vehiculo.Service/", "eliminarVehiculo");
    private final static QName _ActualizarVehiculo_QNAME = new QName("http://Vehiculo.Service/", "actualizarVehiculo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Vehiculo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EliminarVehiculo }
     * 
     */
    public EliminarVehiculo createEliminarVehiculo() {
        return new EliminarVehiculo();
    }

    /**
     * Create an instance of {@link ActualizarVehiculo }
     * 
     */
    public ActualizarVehiculo createActualizarVehiculo() {
        return new ActualizarVehiculo();
    }

    /**
     * Create an instance of {@link BuscarVehiculo }
     * 
     */
    public BuscarVehiculo createBuscarVehiculo() {
        return new BuscarVehiculo();
    }

    /**
     * Create an instance of {@link ActualizarVehiculoResponse }
     * 
     */
    public ActualizarVehiculoResponse createActualizarVehiculoResponse() {
        return new ActualizarVehiculoResponse();
    }

    /**
     * Create an instance of {@link EliminarVehiculoResponse }
     * 
     */
    public EliminarVehiculoResponse createEliminarVehiculoResponse() {
        return new EliminarVehiculoResponse();
    }

    /**
     * Create an instance of {@link InsertarVehiculoResponse }
     * 
     */
    public InsertarVehiculoResponse createInsertarVehiculoResponse() {
        return new InsertarVehiculoResponse();
    }

    /**
     * Create an instance of {@link BuscarVehiculoResponse }
     * 
     */
    public BuscarVehiculoResponse createBuscarVehiculoResponse() {
        return new BuscarVehiculoResponse();
    }

    /**
     * Create an instance of {@link ListarVehiculos }
     * 
     */
    public ListarVehiculos createListarVehiculos() {
        return new ListarVehiculos();
    }

    /**
     * Create an instance of {@link InsertarVehiculo }
     * 
     */
    public InsertarVehiculo createInsertarVehiculo() {
        return new InsertarVehiculo();
    }

    /**
     * Create an instance of {@link ListarVehiculosResponse }
     * 
     */
    public ListarVehiculosResponse createListarVehiculosResponse() {
        return new ListarVehiculosResponse();
    }

    /**
     * Create an instance of {@link Vehiculo }
     * 
     */
    public Vehiculo createVehiculo() {
        return new Vehiculo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "buscarVehiculoResponse")
    public JAXBElement<BuscarVehiculoResponse> createBuscarVehiculoResponse(BuscarVehiculoResponse value) {
        return new JAXBElement<BuscarVehiculoResponse>(_BuscarVehiculoResponse_QNAME, BuscarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVehiculos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "listarVehiculos")
    public JAXBElement<ListarVehiculos> createListarVehiculos(ListarVehiculos value) {
        return new JAXBElement<ListarVehiculos>(_ListarVehiculos_QNAME, ListarVehiculos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "insertarVehiculo")
    public JAXBElement<InsertarVehiculo> createInsertarVehiculo(InsertarVehiculo value) {
        return new JAXBElement<InsertarVehiculo>(_InsertarVehiculo_QNAME, InsertarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarVehiculosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "listarVehiculosResponse")
    public JAXBElement<ListarVehiculosResponse> createListarVehiculosResponse(ListarVehiculosResponse value) {
        return new JAXBElement<ListarVehiculosResponse>(_ListarVehiculosResponse_QNAME, ListarVehiculosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "insertarVehiculoResponse")
    public JAXBElement<InsertarVehiculoResponse> createInsertarVehiculoResponse(InsertarVehiculoResponse value) {
        return new JAXBElement<InsertarVehiculoResponse>(_InsertarVehiculoResponse_QNAME, InsertarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "buscarVehiculo")
    public JAXBElement<BuscarVehiculo> createBuscarVehiculo(BuscarVehiculo value) {
        return new JAXBElement<BuscarVehiculo>(_BuscarVehiculo_QNAME, BuscarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "actualizarVehiculoResponse")
    public JAXBElement<ActualizarVehiculoResponse> createActualizarVehiculoResponse(ActualizarVehiculoResponse value) {
        return new JAXBElement<ActualizarVehiculoResponse>(_ActualizarVehiculoResponse_QNAME, ActualizarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVehiculoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "eliminarVehiculoResponse")
    public JAXBElement<EliminarVehiculoResponse> createEliminarVehiculoResponse(EliminarVehiculoResponse value) {
        return new JAXBElement<EliminarVehiculoResponse>(_EliminarVehiculoResponse_QNAME, EliminarVehiculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "eliminarVehiculo")
    public JAXBElement<EliminarVehiculo> createEliminarVehiculo(EliminarVehiculo value) {
        return new JAXBElement<EliminarVehiculo>(_EliminarVehiculo_QNAME, EliminarVehiculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarVehiculo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Vehiculo.Service/", name = "actualizarVehiculo")
    public JAXBElement<ActualizarVehiculo> createActualizarVehiculo(ActualizarVehiculo value) {
        return new JAXBElement<ActualizarVehiculo>(_ActualizarVehiculo_QNAME, ActualizarVehiculo.class, null, value);
    }

}
