/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.shop.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose Ignacio Flores
 */
@Entity
@Table(name = "wp_woocommerce_attribute_taxonomies")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findAll", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w")
    , @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findByAttributeId", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w WHERE w.attributeId = :attributeId")
    , @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findByAttributeName", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w WHERE w.attributeName = :attributeName")
    , @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findByAttributeType", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w WHERE w.attributeType = :attributeType")
    , @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findByAttributeOrderby", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w WHERE w.attributeOrderby = :attributeOrderby")
    , @NamedQuery(name = "WpWoocommerceAttributeTaxonomies.findByAttributePublic", query = "SELECT w FROM WpWoocommerceAttributeTaxonomies w WHERE w.attributePublic = :attributePublic")})
public class WpWoocommerceAttributeTaxonomies implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "attribute_id")
    private Long attributeId;
    @Basic(optional = false)
    @Column(name = "attribute_name")
    private String attributeName;
    @Lob
    @Column(name = "attribute_label")
    private String attributeLabel;
    @Basic(optional = false)
    @Column(name = "attribute_type")
    private String attributeType;
    @Basic(optional = false)
    @Column(name = "attribute_orderby")
    private String attributeOrderby;
    @Basic(optional = false)
    @Column(name = "attribute_public")
    private int attributePublic;

    public WpWoocommerceAttributeTaxonomies() {
    }

    public WpWoocommerceAttributeTaxonomies(Long attributeId) {
        this.attributeId = attributeId;
    }

    public WpWoocommerceAttributeTaxonomies(Long attributeId, String attributeName, String attributeType, String attributeOrderby, int attributePublic) {
        this.attributeId = attributeId;
        this.attributeName = attributeName;
        this.attributeType = attributeType;
        this.attributeOrderby = attributeOrderby;
        this.attributePublic = attributePublic;
    }

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeLabel() {
        return attributeLabel;
    }

    public void setAttributeLabel(String attributeLabel) {
        this.attributeLabel = attributeLabel;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getAttributeOrderby() {
        return attributeOrderby;
    }

    public void setAttributeOrderby(String attributeOrderby) {
        this.attributeOrderby = attributeOrderby;
    }

    public int getAttributePublic() {
        return attributePublic;
    }

    public void setAttributePublic(int attributePublic) {
        this.attributePublic = attributePublic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (attributeId != null ? attributeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceAttributeTaxonomies)) {
            return false;
        }
        WpWoocommerceAttributeTaxonomies other = (WpWoocommerceAttributeTaxonomies) object;
        if ((this.attributeId == null && other.attributeId != null) || (this.attributeId != null && !this.attributeId.equals(other.attributeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceAttributeTaxonomies[ attributeId=" + attributeId + " ]";
    }
    
}
