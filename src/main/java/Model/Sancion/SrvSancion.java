
package Model.Sancion;

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
@WebService(name = "srvSancion", targetNamespace = "http://Sancion.Service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SrvSancion {


    /**
     * 
     * @return
     *     returns java.util.List<Model.Sancion.Sancion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarSanciones", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.ListarSanciones")
    @ResponseWrapper(localName = "listarSancionesResponse", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.ListarSancionesResponse")
    @Action(input = "http://Sancion.Service/srvSancion/listarSancionesRequest", output = "http://Sancion.Service/srvSancion/listarSancionesResponse")
    public List<Sancion> listarSanciones();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarSancion", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.EliminarSancion")
    @ResponseWrapper(localName = "eliminarSancionResponse", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.EliminarSancionResponse")
    @Action(input = "http://Sancion.Service/srvSancion/eliminarSancionRequest", output = "http://Sancion.Service/srvSancion/eliminarSancionResponse")
    public int eliminarSancion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns Model.Sancion.Sancion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarSancion", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.BuscarSancion")
    @ResponseWrapper(localName = "buscarSancionResponse", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.BuscarSancionResponse")
    @Action(input = "http://Sancion.Service/srvSancion/buscarSancionRequest", output = "http://Sancion.Service/srvSancion/buscarSancionResponse")
    public Sancion buscarSancion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertarSancion", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.InsertarSancion")
    @ResponseWrapper(localName = "insertarSancionResponse", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.InsertarSancionResponse")
    @Action(input = "http://Sancion.Service/srvSancion/insertarSancionRequest", output = "http://Sancion.Service/srvSancion/insertarSancionResponse")
    public int insertarSancion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "actualizarSancion", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.ActualizarSancion")
    @ResponseWrapper(localName = "actualizarSancionResponse", targetNamespace = "http://Sancion.Service/", className = "Model.Sancion.ActualizarSancionResponse")
    @Action(input = "http://Sancion.Service/srvSancion/actualizarSancionRequest", output = "http://Sancion.Service/srvSancion/actualizarSancionResponse")
    public int actualizarSancion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

}
