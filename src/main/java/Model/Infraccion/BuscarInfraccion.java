
package Model.Infraccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para buscarInfraccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="buscarInfraccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInfraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarInfraccion", propOrder = {
    "idInfraccion"
})
public class BuscarInfraccion {

    protected String idInfraccion;

    /**
     * Obtiene el valor de la propiedad idInfraccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInfraccion() {
        return idInfraccion;
    }

    /**
     * Define el valor de la propiedad idInfraccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInfraccion(String value) {
        this.idInfraccion = value;
    }

}
