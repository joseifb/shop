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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose Ignacio Flores
 */
@Entity
@Table(name = "wp_woocommerce_shipping_zones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceShippingZones.findAll", query = "SELECT w FROM WpWoocommerceShippingZones w")
    , @NamedQuery(name = "WpWoocommerceShippingZones.findByZoneId", query = "SELECT w FROM WpWoocommerceShippingZones w WHERE w.zoneId = :zoneId")
    , @NamedQuery(name = "WpWoocommerceShippingZones.findByZoneName", query = "SELECT w FROM WpWoocommerceShippingZones w WHERE w.zoneName = :zoneName")
    , @NamedQuery(name = "WpWoocommerceShippingZones.findByZoneOrder", query = "SELECT w FROM WpWoocommerceShippingZones w WHERE w.zoneOrder = :zoneOrder")})
public class WpWoocommerceShippingZones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "zone_id")
    private Long zoneId;
    @Basic(optional = false)
    @Column(name = "zone_name")
    private String zoneName;
    @Basic(optional = false)
    @Column(name = "zone_order")
    private long zoneOrder;

    public WpWoocommerceShippingZones() {
    }

    public WpWoocommerceShippingZones(Long zoneId) {
        this.zoneId = zoneId;
    }

    public WpWoocommerceShippingZones(Long zoneId, String zoneName, long zoneOrder) {
        this.zoneId = zoneId;
        this.zoneName = zoneName;
        this.zoneOrder = zoneOrder;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public long getZoneOrder() {
        return zoneOrder;
    }

    public void setZoneOrder(long zoneOrder) {
        this.zoneOrder = zoneOrder;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (zoneId != null ? zoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceShippingZones)) {
            return false;
        }
        WpWoocommerceShippingZones other = (WpWoocommerceShippingZones) object;
        if ((this.zoneId == null && other.zoneId != null) || (this.zoneId != null && !this.zoneId.equals(other.zoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceShippingZones[ zoneId=" + zoneId + " ]";
    }
    
}
