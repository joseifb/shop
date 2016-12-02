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
@Table(name = "wp_woocommerce_shipping_zone_methods")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findAll", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w")
    , @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findByZoneId", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w WHERE w.zoneId = :zoneId")
    , @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findByInstanceId", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w WHERE w.instanceId = :instanceId")
    , @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findByMethodId", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w WHERE w.methodId = :methodId")
    , @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findByMethodOrder", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w WHERE w.methodOrder = :methodOrder")
    , @NamedQuery(name = "WpWoocommerceShippingZoneMethods.findByIsEnabled", query = "SELECT w FROM WpWoocommerceShippingZoneMethods w WHERE w.isEnabled = :isEnabled")})
public class WpWoocommerceShippingZoneMethods implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "zone_id")
    private long zoneId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "instance_id")
    private Long instanceId;
    @Basic(optional = false)
    @Column(name = "method_id")
    private String methodId;
    @Basic(optional = false)
    @Column(name = "method_order")
    private long methodOrder;
    @Basic(optional = false)
    @Column(name = "is_enabled")
    private boolean isEnabled;

    public WpWoocommerceShippingZoneMethods() {
    }

    public WpWoocommerceShippingZoneMethods(Long instanceId) {
        this.instanceId = instanceId;
    }

    public WpWoocommerceShippingZoneMethods(Long instanceId, long zoneId, String methodId, long methodOrder, boolean isEnabled) {
        this.instanceId = instanceId;
        this.zoneId = zoneId;
        this.methodId = methodId;
        this.methodOrder = methodOrder;
        this.isEnabled = isEnabled;
    }

    public long getZoneId() {
        return zoneId;
    }

    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public long getMethodOrder() {
        return methodOrder;
    }

    public void setMethodOrder(long methodOrder) {
        this.methodOrder = methodOrder;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (instanceId != null ? instanceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceShippingZoneMethods)) {
            return false;
        }
        WpWoocommerceShippingZoneMethods other = (WpWoocommerceShippingZoneMethods) object;
        if ((this.instanceId == null && other.instanceId != null) || (this.instanceId != null && !this.instanceId.equals(other.instanceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceShippingZoneMethods[ instanceId=" + instanceId + " ]";
    }
    
}
