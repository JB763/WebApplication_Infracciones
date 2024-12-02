
package Model.Conductor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarConductor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarConductor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLicencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarConductor", propOrder = {
    "idLicencia"
})
public class EliminarConductor {

    protected String idLicencia;

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

}
