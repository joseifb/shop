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
@Table(name = "wp_woocommerce_sessions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceSessions.findAll", query = "SELECT w FROM WpWoocommerceSessions w")
    , @NamedQuery(name = "WpWoocommerceSessions.findBySessionId", query = "SELECT w FROM WpWoocommerceSessions w WHERE w.sessionId = :sessionId")
    , @NamedQuery(name = "WpWoocommerceSessions.findBySessionKey", query = "SELECT w FROM WpWoocommerceSessions w WHERE w.sessionKey = :sessionKey")
    , @NamedQuery(name = "WpWoocommerceSessions.findBySessionExpiry", query = "SELECT w FROM WpWoocommerceSessions w WHERE w.sessionExpiry = :sessionExpiry")})
public class WpWoocommerceSessions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "session_id")
    private long sessionId;
    @Id
    @Basic(optional = false)
    @Column(name = "session_key")
    private String sessionKey;
    @Basic(optional = false)
    @Lob
    @Column(name = "session_value")
    private String sessionValue;
    @Basic(optional = false)
    @Column(name = "session_expiry")
    private long sessionExpiry;

    public WpWoocommerceSessions() {
    }

    public WpWoocommerceSessions(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public WpWoocommerceSessions(String sessionKey, long sessionId, String sessionValue, long sessionExpiry) {
        this.sessionKey = sessionKey;
        this.sessionId = sessionId;
        this.sessionValue = sessionValue;
        this.sessionExpiry = sessionExpiry;
    }

    public long getSessionId() {
        return sessionId;
    }

    public void setSessionId(long sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getSessionValue() {
        return sessionValue;
    }

    public void setSessionValue(String sessionValue) {
        this.sessionValue = sessionValue;
    }

    public long getSessionExpiry() {
        return sessionExpiry;
    }

    public void setSessionExpiry(long sessionExpiry) {
        this.sessionExpiry = sessionExpiry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionKey != null ? sessionKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceSessions)) {
            return false;
        }
        WpWoocommerceSessions other = (WpWoocommerceSessions) object;
        if ((this.sessionKey == null && other.sessionKey != null) || (this.sessionKey != null && !this.sessionKey.equals(other.sessionKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceSessions[ sessionKey=" + sessionKey + " ]";
    }
    
}
