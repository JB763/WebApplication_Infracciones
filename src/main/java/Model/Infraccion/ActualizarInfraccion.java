
package Model.Infraccion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarInfraccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarInfraccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idInfraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="multa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarInfraccion", propOrder = {
    "idInfraccion",
    "descripcion",
    "multa"
})
public class ActualizarInfraccion {

    protected String idInfraccion;
    protected String descripcion;
    protected int multa;

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

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad multa.
     * 
     */
    public int getMulta() {
        return multa;
    }

    /**
     * Define el valor de la propiedad multa.
     * 
     */
    public void setMulta(int value) {
        this.multa = value;
    }

}
