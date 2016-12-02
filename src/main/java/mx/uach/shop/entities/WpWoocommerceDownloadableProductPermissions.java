/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uach.shop.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "wp_woocommerce_downloadable_product_permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findAll", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByPermissionId", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.permissionId = :permissionId")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByDownloadId", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.downloadId = :downloadId")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByProductId", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.productId = :productId")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByOrderId", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.orderId = :orderId")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByOrderKey", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.orderKey = :orderKey")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByUserEmail", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.userEmail = :userEmail")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByUserId", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.userId = :userId")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByDownloadsRemaining", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.downloadsRemaining = :downloadsRemaining")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByAccessGranted", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.accessGranted = :accessGranted")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByAccessExpires", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.accessExpires = :accessExpires")
    , @NamedQuery(name = "WpWoocommerceDownloadableProductPermissions.findByDownloadCount", query = "SELECT w FROM WpWoocommerceDownloadableProductPermissions w WHERE w.downloadCount = :downloadCount")})
public class WpWoocommerceDownloadableProductPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "permission_id")
    private Long permissionId;
    @Basic(optional = false)
    @Column(name = "download_id")
    private String downloadId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private long productId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private long orderId;
    @Basic(optional = false)
    @Column(name = "order_key")
    private String orderKey;
    @Basic(optional = false)
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_id")
    private BigInteger userId;
    @Column(name = "downloads_remaining")
    private String downloadsRemaining;
    @Basic(optional = false)
    @Column(name = "access_granted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessGranted;
    @Column(name = "access_expires")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accessExpires;
    @Basic(optional = false)
    @Column(name = "download_count")
    private long downloadCount;

    public WpWoocommerceDownloadableProductPermissions() {
    }

    public WpWoocommerceDownloadableProductPermissions(Long permissionId) {
        this.permissionId = permissionId;
    }

    public WpWoocommerceDownloadableProductPermissions(Long permissionId, String downloadId, long productId, long orderId, String orderKey, String userEmail, Date accessGranted, long downloadCount) {
        this.permissionId = permissionId;
        this.downloadId = downloadId;
        this.productId = productId;
        this.orderId = orderId;
        this.orderKey = orderKey;
        this.userEmail = userEmail;
        this.accessGranted = accessGranted;
        this.downloadCount = downloadCount;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getDownloadId() {
        return downloadId;
    }

    public void setDownloadId(String downloadId) {
        this.downloadId = downloadId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getDownloadsRemaining() {
        return downloadsRemaining;
    }

    public void setDownloadsRemaining(String downloadsRemaining) {
        this.downloadsRemaining = downloadsRemaining;
    }

    public Date getAccessGranted() {
        return accessGranted;
    }

    public void setAccessGranted(Date accessGranted) {
        this.accessGranted = accessGranted;
    }

    public Date getAccessExpires() {
        return accessExpires;
    }

    public void setAccessExpires(Date accessExpires) {
        this.accessExpires = accessExpires;
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(long downloadCount) {
        this.downloadCount = downloadCount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permissionId != null ? permissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WpWoocommerceDownloadableProductPermissions)) {
            return false;
        }
        WpWoocommerceDownloadableProductPermissions other = (WpWoocommerceDownloadableProductPermissions) object;
        if ((this.permissionId == null && other.permissionId != null) || (this.permissionId != null && !this.permissionId.equals(other.permissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.uach.shop.entities.WpWoocommerceDownloadableProductPermissions[ permissionId=" + permissionId + " ]";
    }
    
}
