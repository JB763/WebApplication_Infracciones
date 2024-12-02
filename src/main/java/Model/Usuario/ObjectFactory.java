
package Model.Usuario;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Model.Usuario package. 
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

    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://Usuario.Service/", "buscarUsuarioResponse");
    private final static QName _AutenticarUsuarioResponse_QNAME = new QName("http://Usuario.Service/", "autenticarUsuarioResponse");
    private final static QName _BuscarUsuario_QNAME = new QName("http://Usuario.Service/", "buscarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://Usuario.Service/", "eliminarUsuarioResponse");
    private final static QName _ActualizarUsuarioResponse_QNAME = new QName("http://Usuario.Service/", "actualizarUsuarioResponse");
    private final static QName _InsertarUsuario_QNAME = new QName("http://Usuario.Service/", "insertarUsuario");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://Usuario.Service/", "listarUsuariosResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("http://Usuario.Service/", "listarUsuarios");
    private final static QName _ActualizarUsuario_QNAME = new QName("http://Usuario.Service/", "actualizarUsuario");
    private final static QName _AutenticarUsuario_QNAME = new QName("http://Usuario.Service/", "autenticarUsuario");
    private final static QName _EliminarUsuario_QNAME = new QName("http://Usuario.Service/", "eliminarUsuario");
    private final static QName _InsertarUsuarioResponse_QNAME = new QName("http://Usuario.Service/", "insertarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Model.Usuario
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link AutenticarUsuarioResponse }
     * 
     */
    public AutenticarUsuarioResponse createAutenticarUsuarioResponse() {
        return new AutenticarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link AutenticarUsuario }
     * 
     */
    public AutenticarUsuario createAutenticarUsuario() {
        return new AutenticarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "buscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "autenticarUsuarioResponse")
    public JAXBElement<AutenticarUsuarioResponse> createAutenticarUsuarioResponse(AutenticarUsuarioResponse value) {
        return new JAXBElement<AutenticarUsuarioResponse>(_AutenticarUsuarioResponse_QNAME, AutenticarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "buscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "eliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "actualizarUsuarioResponse")
    public JAXBElement<ActualizarUsuarioResponse> createActualizarUsuarioResponse(ActualizarUsuarioResponse value) {
        return new JAXBElement<ActualizarUsuarioResponse>(_ActualizarUsuarioResponse_QNAME, ActualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "insertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "actualizarUsuario")
    public JAXBElement<ActualizarUsuario> createActualizarUsuario(ActualizarUsuario value) {
        return new JAXBElement<ActualizarUsuario>(_ActualizarUsuario_QNAME, ActualizarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutenticarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "autenticarUsuario")
    public JAXBElement<AutenticarUsuario> createAutenticarUsuario(AutenticarUsuario value) {
        return new JAXBElement<AutenticarUsuario>(_AutenticarUsuario_QNAME, AutenticarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "eliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Usuario.Service/", name = "insertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

}
