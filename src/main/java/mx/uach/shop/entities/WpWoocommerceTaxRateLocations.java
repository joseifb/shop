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
@Table(name = "wp_woocommerce_tax_rate_locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceTaxRateLocations.findAll", query = "SELECT w FROM WpWoocommerceTaxRateLocations w")
    , @NamedQuery(name = "WpWoocommerceTaxRateLocations.findByLocationId", query = "SELECT w FROM WpWoocommerceTaxRateLocations w WHERE w.locationId = :locationId")
    , @NamedQuery(name = "WpWoocommerceTaxRateLocations.findByLocationCode", query = "SELECT w FROM WpWoocommerceTaxRateLocations w WHERE w.locationCode = :locationCode")
    , @NamedQuery(name = "WpWoocommerceTaxRateLocations.findByTaxRateId", query = "SELECT w FROM WpWoocommerceTaxRateLocations w WHERE w.taxRateId = :taxRateId")
    , @NamedQuery(name = "WpWoocommerceTaxRateLocations.findByLocationType", query = "SELECT w FROM WpWoocommerceTaxRateLocations w WHERE w.locationType = :locationType")})
public class WpWoocommerceTaxRateLocations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "location_id")
    private Long locationId;
    @Basic(optional = false)
    @Column(name = "location_code")
    private String locationCode;
    @Basic(optional = false)
    @Column(name = "tax_rate_id")
    private long taxRateId;
    @Basic(optional = false)
    @Column(name = "location_type")
    private String locationType;

    public WpWoocommerceTaxRateLocations() {
    }

    public WpWoocommerceTaxRateLocations(Long locationId) {
        this.locationId = locationId;
    }

    public WpWoocommerceTaxRateLocations(Long locationId, String locationCode, long taxRateId, String locationType) {
        this.locationId = locationId;
        this.locationCode = locationCode;
        this.taxRateId = taxRateId;
        this.locationType = locationType;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public long getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(long taxRateId) {
        this.taxRateId = taxRateId;
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
        if (!(object instanceof WpWoocommerceTaxRateLocations)) {
            return false;
        }
        WpWoocommerceTaxRateLocations other = (WpWoocommerceTaxRateLocations) object;
        if ((this.locationId == null && other.locationId != null) || (this.locationId != null && !this.locationId.equals(other.locationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceTaxRateLocations[ locationId=" + locationId + " ]";
    }
    
}
