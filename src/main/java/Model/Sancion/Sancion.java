
package Model.Sancion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sancion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sancion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha_impuesta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAgente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idInfraccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idSancion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sancion", propOrder = {
    "fechaImpuesta",
    "idAgente",
    "idInfraccion",
    "idLicencia",
    "idSancion"
})
public class Sancion {

    @XmlElement(name = "fecha_impuesta")
    protected String fechaImpuesta;
    protected String idAgente;
    protected String idInfraccion;
    protected String idLicencia;
    protected String idSancion;

    /**
     * Obtiene el valor de la propiedad fechaImpuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaImpuesta() {
        return fechaImpuesta;
    }

    /**
     * Define el valor de la propiedad fechaImpuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaImpuesta(String value) {
        this.fechaImpuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad idAgente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAgente() {
        return idAgente;
    }

    /**
     * Define el valor de la propiedad idAgente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAgente(String value) {
        this.idAgente = value;
    }

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
     * Obtiene el valor de la propiedad idLicencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLicencia() {
        return idLicencia;
    }

    /**
     * Define el valor de la propiedad idLicencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLicencia(String value) {
        this.idLicencia = value;
    }

    /**
     * Obtiene el valor de la propiedad idSancion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSancion() {
        return idSancion;
    }

    /**
     * Define el valor de la propiedad idSancion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSancion(String value) {
        this.idSancion = value;
    }

}
