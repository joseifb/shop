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
@Table(name = "wp_woocommerce_payment_tokenmeta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommercePaymentTokenmeta.findAll", query = "SELECT w FROM WpWoocommercePaymentTokenmeta w")
    , @NamedQuery(name = "WpWoocommercePaymentTokenmeta.findByMetaId", query = "SELECT w FROM WpWoocommercePaymentTokenmeta w WHERE w.metaId = :metaId")
    , @NamedQuery(name = "WpWoocommercePaymentTokenmeta.findByPaymentTokenId", query = "SELECT w FROM WpWoocommercePaymentTokenmeta w WHERE w.paymentTokenId = :paymentTokenId")
    , @NamedQuery(name = "WpWoocommercePaymentTokenmeta.findByMetaKey", query = "SELECT w FROM WpWoocommercePaymentTokenmeta w WHERE w.metaKey = :metaKey")})
public class WpWoocommercePaymentTokenmeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "meta_id")
    private Long metaId;
    @Basic(optional = false)
    @Column(name = "payment_token_id")
    private long paymentTokenId;
    @Column(name = "meta_key")
    private String metaKey;
    @Lob
    @Column(name = "meta_value")
    private String metaValue;

    public WpWoocommercePaymentTokenmeta() {
    }

    public WpWoocommercePaymentTokenmeta(Long metaId) {
        this.metaId = metaId;
    }

    public WpWoocommercePaymentTokenmeta(Long metaId, long paymentTokenId) {
        this.metaId = metaId;
        this.paymentTokenId = paymentTokenId;
    }

    public Long getMetaId() {
        return metaId;
    }

    public void setMetaId(Long metaId) {
        this.metaId = metaId;
    }

    public long getPaymentTokenId() {
        return paymentTokenId;
    }

    public void setPaymentTokenId(long paymentTokenId) {
        this.paymentTokenId = paymentTokenId;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (metaId != null ? metaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommercePaymentTokenmeta)) {
            return false;
        }
        WpWoocommercePaymentTokenmeta other = (WpWoocommercePaymentTokenmeta) object;
        if ((this.metaId == null && other.metaId != null) || (this.metaId != null && !this.metaId.equals(other.metaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommercePaymentTokenmeta[ metaId=" + metaId + " ]";
    }
    
}
