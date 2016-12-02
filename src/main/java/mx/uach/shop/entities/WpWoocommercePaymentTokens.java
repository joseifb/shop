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
@Table(name = "wp_woocommerce_payment_tokens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommercePaymentTokens.findAll", query = "SELECT w FROM WpWoocommercePaymentTokens w")
    , @NamedQuery(name = "WpWoocommercePaymentTokens.findByTokenId", query = "SELECT w FROM WpWoocommercePaymentTokens w WHERE w.tokenId = :tokenId")
    , @NamedQuery(name = "WpWoocommercePaymentTokens.findByGatewayId", query = "SELECT w FROM WpWoocommercePaymentTokens w WHERE w.gatewayId = :gatewayId")
    , @NamedQuery(name = "WpWoocommercePaymentTokens.findByUserId", query = "SELECT w FROM WpWoocommercePaymentTokens w WHERE w.userId = :userId")
    , @NamedQuery(name = "WpWoocommercePaymentTokens.findByType", query = "SELECT w FROM WpWoocommercePaymentTokens w WHERE w.type = :type")
    , @NamedQuery(name = "WpWoocommercePaymentTokens.findByIsDefault", query = "SELECT w FROM WpWoocommercePaymentTokens w WHERE w.isDefault = :isDefault")})
public class WpWoocommercePaymentTokens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "token_id")
    private Long tokenId;
    @Basic(optional = false)
    @Column(name = "gateway_id")
    private String gatewayId;
    @Basic(optional = false)
    @Lob
    @Column(name = "token")
    private String token;
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userId;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "is_default")
    private boolean isDefault;

    public WpWoocommercePaymentTokens() {
    }

    public WpWoocommercePaymentTokens(Long tokenId) {
        this.tokenId = tokenId;
    }

    public WpWoocommercePaymentTokens(Long tokenId, String gatewayId, String token, long userId, String type, boolean isDefault) {
        this.tokenId = tokenId;
        this.gatewayId = gatewayId;
        this.token = token;
        this.userId = userId;
        this.type = type;
        this.isDefault = isDefault;
    }

    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tokenId != null ? tokenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommercePaymentTokens)) {
            return false;
        }
        WpWoocommercePaymentTokens other = (WpWoocommercePaymentTokens) object;
        if ((this.tokenId == null && other.tokenId != null) || (this.tokenId != null && !this.tokenId.equals(other.tokenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommercePaymentTokens[ tokenId=" + tokenId + " ]";
    }
    
}
