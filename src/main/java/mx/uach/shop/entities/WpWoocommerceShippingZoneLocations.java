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
@Table(name = "wp_woocommerce_shipping_zone_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceShippingZoneLocations.findAll", query = "SELECT w FROM WpWoocommerceShippingZoneLocations w")
    , @NamedQuery(name = "WpWoocommerceShippingZoneLocations.findByLocationId", query = "SELECT w FROM WpWoocommerceShippingZoneLocations w WHERE w.locationId = :locationId")
    , @NamedQuery(name = "WpWoocommerceShippingZoneLocations.findByZoneId", query = "SELECT w FROM WpWoocommerceShippingZoneLocations w WHERE w.zoneId = :zoneId")
    , @NamedQuery(name = "WpWoocommerceShippingZoneLocations.findByLocationCode", query = "SELECT w FROM WpWoocommerceShippingZoneLocations w WHERE w.locationCode = :locationCode")
    , @NamedQuery(name = "WpWoocommerceShippingZoneLocations.findByLocationType", query = "SELECT w FROM WpWoocommerceShippingZoneLocations w WHERE w.locationType = :locationType")})
public class WpWoocommerceShippingZoneLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "location_id")
    private Long locationId;
    @Basic(optional = false)
    @Column(name = "zone_id")
    private long zoneId;
    @Basic(optional = false)
    @Column(name = "location_code")
    private String locationCode;
    @Basic(optional = false)
    @Column(name = "location_type")
    private String locationType;

    public WpWoocommerceShippingZoneLocations() {
    }

    public WpWoocommerceShippingZoneLocations(Long locationId) {
        this.locationId = locationId;
    }

    public WpWoocommerceShippingZoneLocations(Long locationId, long zoneId, String locationCode, String locationType) {
        this.locationId = locationId;
        this.zoneId = zoneId;
        this.locationCode = locationCode;
        this.locationType = locationType;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public long getZoneId() {
        return zoneId;
    }

    public void setZoneId(long zoneId) {
        this.zoneId = zoneId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locationId != null ? locationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceShippingZoneLocations)) {
            return false;
        }
        WpWoocommerceShippingZoneLocations other = (WpWoocommerceShippingZoneLocations) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceShippingZoneLocations[ locationId=" + locationId + " ]";
    }
    
}
