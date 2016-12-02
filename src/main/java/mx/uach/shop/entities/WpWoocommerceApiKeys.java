/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.shop.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jose Ignacio Flores
 */
@Entity
@Table(name = "wp_woocommerce_api_keys")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceApiKeys.findAll", query = "SELECT w FROM WpWoocommerceApiKeys w")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByKeyId", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.keyId = :keyId")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByUserId", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.userId = :userId")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByPermissions", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.permissions = :permissions")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByConsumerKey", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.consumerKey = :consumerKey")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByConsumerSecret", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.consumerSecret = :consumerSecret")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByTruncatedKey", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.truncatedKey = :truncatedKey")
    , @NamedQuery(name = "WpWoocommerceApiKeys.findByLastAccess", query = "SELECT w FROM WpWoocommerceApiKeys w WHERE w.lastAccess = :lastAccess")})
public class WpWoocommerceApiKeys implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "key_id")
    private Long keyId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userId;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "permissions")
    private String permissions;
    @Basic(optional = false)
    @Column(name = "consumer_key")
    private String consumerKey;
    @Basic(optional = false)
    @Column(name = "consumer_secret")
    private String consumerSecret;
    @Lob
    @Column(name = "nonces")
    private String nonces;
    @Basic(optional = false)
    @Column(name = "truncated_key")
    private String truncatedKey;
    @Column(name = "last_access")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAccess;

    public WpWoocommerceApiKeys() {
    }

    public WpWoocommerceApiKeys(Long keyId) {
        this.keyId = keyId;
    }

    public WpWoocommerceApiKeys(Long keyId, long userId, String permissions, String consumerKey, String consumerSecret, String truncatedKey) {
        this.keyId = keyId;
        this.userId = userId;
        this.permissions = permissions;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.truncatedKey = truncatedKey;
    }

    public Long getKeyId() {
        return keyId;
    }

    public void setKeyId(Long keyId) {
        this.keyId = keyId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getNonces() {
        return nonces;
    }

    public void setNonces(String nonces) {
        this.nonces = nonces;
    }

    public String getTruncatedKey() {
        return truncatedKey;
    }

    public void setTruncatedKey(String truncatedKey) {
        this.truncatedKey = truncatedKey;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyId != null ? keyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceApiKeys)) {
            return false;
        }
        WpWoocommerceApiKeys other = (WpWoocommerceApiKeys) object;
        if ((this.keyId == null && other.keyId != null) || (this.keyId != null && !this.keyId.equals(other.keyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceApiKeys[ keyId=" + keyId + " ]";
    }
    
}
