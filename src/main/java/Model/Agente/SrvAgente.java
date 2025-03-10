
package Model.Agente;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "srvAgente", targetNamespace = "http://Agente.Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SrvAgente {


    /**
     * 
     * @param idAgente
     * @return
     *     returns Model.Agente.Agente
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarAgente", targetNamespace = "http://Agente.Service/", className = "Model.Agente.BuscarAgente")
    @ResponseWrapper(localName = "buscarAgenteResponse", targetNamespace = "http://Agente.Service/", className = "Model.Agente.BuscarAgenteResponse")
    @Action(input = "http://Agente.Service/srvAgente/buscarAgenteRequest", output = "http://Agente.Service/srvAgente/buscarAgenteResponse")
    public Agente buscarAgente(
        @WebParam(name = "idAgente", targetNamespace = "")
        String idAgente);

    /**
     * 
     * @param idAgente
     * @param nombre
     * @param sector
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarAgente", targetNamespace = "http://Agente.Service/", className = "Model.Agente.InsertarAgente")
    @ResponseWrapper(localName = "insertarAgenteResponse", targetNamespace = "http://Agente.Service/", className = "Model.Agente.InsertarAgenteResponse")
    @Action(input = "http://Agente.Service/srvAgente/insertarAgenteRequest", output = "http://Agente.Service/srvAgente/insertarAgenteResponse")
    public int insertarAgente(
        @WebParam(name = "idAgente", targetNamespace = "")
        String idAgente,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "sector", targetNamespace = "")
        String sector);

    /**
     * 
     * @param idAgente
     * @param nombre
     * @param sector
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarAgente", targetNamespace = "http://Agente.Service/", className = "Model.Agente.ActualizarAgente")
    @ResponseWrapper(localName = "actualizarAgenteResponse", targetNamespace = "http://Agente.Service/", className = "Model.Agente.ActualizarAgenteResponse")
    @Action(input = "http://Agente.Service/srvAgente/actualizarAgenteRequest", output = "http://Agente.Service/srvAgente/actualizarAgenteResponse")
    public int actualizarAgente(
        @WebParam(name = "idAgente", targetNamespace = "")
        String idAgente,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "sector", targetNamespace = "")
        String sector);

    /**
     * 
     * @param idAgente
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarAgente", targetNamespace = "http://Agente.Service/", className = "Model.Agente.EliminarAgente")
    @ResponseWrapper(localName = "eliminarAgenteResponse", targetNamespace = "http://Agente.Service/", className = "Model.Agente.EliminarAgenteResponse")
    @Action(input = "http://Agente.Service/srvAgente/eliminarAgenteRequest", output = "http://Agente.Service/srvAgente/eliminarAgenteResponse")
    public int eliminarAgente(
        @WebParam(name = "idAgente", targetNamespace = "")
        String idAgente);

    /**
     * 
     * @return
     *     returns java.util.List<Model.Agente.Agente>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarAgentes", targetNamespace = "http://Agente.Service/", className = "Model.Agente.ListarAgentes")
    @ResponseWrapper(localName = "listarAgentesResponse", targetNamespace = "http://Agente.Service/", className = "Model.Agente.ListarAgentesResponse")
    @Action(input = "http://Agente.Service/srvAgente/listarAgentesRequest", output = "http://Agente.Service/srvAgente/listarAgentesResponse")
    public List<Agente> listarAgentes();

}
