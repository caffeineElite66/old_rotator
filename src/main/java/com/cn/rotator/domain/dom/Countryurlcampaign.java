package com.cn.rotator.domain.dom;

import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: CountryUrlCampaign.
 * 
 * @author autogenerated
 */

@Entity
@Table(name = "CountryUrlCampaign", catalog = "rotator")
public class Countryurlcampaign implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559008646L;

	/**
	 * Use a WeakHashMap so entries will be garbage collected once all entities
	 * referring to a saved hash are garbage collected themselves.
	 */
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());

	/** hashCode temporary storage. */
	private volatile Long hashCode;

	/** Field mapping. */
	private Long advertiserId;
	/** Field mapping. */
	private String campaignName;
	/** Field mapping. */
	private Byte campaignTypeId;
	/** Field mapping. */
	private String campaignUrl;
	/** Field mapping. */
	private java.math.BigDecimal campaignValue;
	/** Field mapping. */
	private String countryCode;
	/** Field mapping. */
	private Long id = 0L; // init for hibernate bug workaround
	/** Field mapping. */
	private Byte reportingTypeId;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Countryurlcampaign() {
		// Default constructor
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param id
	 *            to set
	 */
	public Countryurlcampaign(Long id) {
		this.id = id;
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param advertiserId
	 *            Long object;
	 * @param campaignName
	 *            String object;
	 * @param campaignTypeId
	 *            Byte object;
	 * @param campaignUrl
	 *            String object;
	 * @param campaignValue
	 *            java.math.BigDecimal object;
	 * @param countryCode
	 *            String object;
	 * @param id
	 *            Long object;
	 * @param reportingTypeId
	 *            Byte object;
	 */
	public Countryurlcampaign(Long advertiserId, String campaignName,
			Byte campaignTypeId, String campaignUrl,
			java.math.BigDecimal campaignValue, String countryCode, Long id,
			Byte reportingTypeId) {

		this.advertiserId = advertiserId;
		this.campaignName = campaignName;
		this.campaignTypeId = campaignTypeId;
		this.campaignUrl = campaignUrl;
		this.campaignValue = campaignValue;
		this.countryCode = countryCode;
		this.id = id;
		this.reportingTypeId = reportingTypeId;
	}

	/**
	 * Return the type of this class. Useful for when dealing with proxies.
	 * 
	 * @return Defining class.
	 */
	@Transient
	public Class<?> getClassType() {
		return Countryurlcampaign.class;
	}

	/**
	 * Return the value associated with the column: advertiserId.
	 * 
	 * @return A Long object (this.advertiserId)
	 */
	@Column(name = "advertiser_id", nullable = false)
	public Long getAdvertiserId() {
		return this.advertiserId;

	}

	/**
	 * Set the value related to the column: advertiserId.
	 * 
	 * @param advertiserId
	 *            the advertiserId value you wish to set
	 */
	public void setAdvertiserId(final Long advertiserId) {
		this.advertiserId = advertiserId;
	}

	/**
	 * Return the value associated with the column: campaignName.
	 * 
	 * @return A String object (this.campaignName)
	 */
	@Column(name = "campaign_name", nullable = false, length = 100)
	public String getCampaignName() {
		return this.campaignName;

	}

	/**
	 * Set the value related to the column: campaignName.
	 * 
	 * @param campaignName
	 *            the campaignName value you wish to set
	 */
	public void setCampaignName(final String campaignName) {
		this.campaignName = campaignName;
	}

	/**
	 * Return the value associated with the column: campaignTypeId.
	 * 
	 * @return A Byte object (this.campaignTypeId)
	 */
	@Column(name = "campaign_type_id", nullable = false)
	public Byte getCampaignTypeId() {
		return this.campaignTypeId;

	}

	/**
	 * Set the value related to the column: campaignTypeId.
	 * 
	 * @param campaignTypeId
	 *            the campaignTypeId value you wish to set
	 */
	public void setCampaignTypeId(final Byte campaignTypeId) {
		this.campaignTypeId = campaignTypeId;
	}

	/**
	 * Return the value associated with the column: campaignUrl.
	 * 
	 * @return A String object (this.campaignUrl)
	 */
	@Column(name = "campaign_url", nullable = false, length = 255)
	public String getCampaignUrl() {
		return this.campaignUrl;

	}

	/**
	 * Set the value related to the column: campaignUrl.
	 * 
	 * @param campaignUrl
	 *            the campaignUrl value you wish to set
	 */
	public void setCampaignUrl(final String campaignUrl) {
		this.campaignUrl = campaignUrl;
	}

	/**
	 * Return the value associated with the column: campaignValue.
	 * 
	 * @return A java.math.BigDecimal object (this.campaignValue)
	 */
	@Column(name = "campaign_value", nullable = false)
	public java.math.BigDecimal getCampaignValue() {
		return this.campaignValue;

	}

	/**
	 * Set the value related to the column: campaignValue.
	 * 
	 * @param campaignValue
	 *            the campaignValue value you wish to set
	 */
	public void setCampaignValue(final java.math.BigDecimal campaignValue) {
		this.campaignValue = campaignValue;
	}

	/**
	 * Return the value associated with the column: countryCode.
	 * 
	 * @return A String object (this.countryCode)
	 */
	@Column(name = "country_code", nullable = false, length = 2)
	public String getCountryCode() {
		return this.countryCode;

	}

	/**
	 * Set the value related to the column: countryCode.
	 * 
	 * @param countryCode
	 *            the countryCode value you wish to set
	 */
	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * Return the value associated with the column: id.
	 * 
	 * @return A Long object (this.id)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public Long getId() {
		return this.id;

	}

	/**
	 * Set the value related to the column: id.
	 * 
	 * @param id
	 *            the id value you wish to set
	 */
	public void setId(final Long id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ((this.id == null || this.id == 0L) && (id != null)
				&& (this.hashCode != null)) {
			SAVED_HASHES.put(id, this.hashCode);
		}
		this.id = id;
	}

	/**
	 * Return the value associated with the column: reportingTypeId.
	 * 
	 * @return A Byte object (this.reportingTypeId)
	 */
	@Column(name = "reporting_type_id", nullable = false)
	public Byte getReportingTypeId() {
		return this.reportingTypeId;

	}

	/**
	 * Set the value related to the column: reportingTypeId.
	 * 
	 * @param reportingTypeId
	 *            the reportingTypeId value you wish to set
	 */
	public void setReportingTypeId(final Byte reportingTypeId) {
		this.reportingTypeId = reportingTypeId;
	}

	/**
	 * Deep copy.
	 * 
	 * @return cloned object
	 * @throws CloneNotSupportedException
	 *             on error
	 */
	@Override
	public Countryurlcampaign clone() throws CloneNotSupportedException {

		final Countryurlcampaign copy = (Countryurlcampaign) super.clone();

		copy.setAdvertiserId(this.getAdvertiserId());
		copy.setCampaignName(this.getCampaignName());
		copy.setCampaignTypeId(this.getCampaignTypeId());
		copy.setCampaignUrl(this.getCampaignUrl());
		copy.setCampaignValue(this.getCampaignValue());
		copy.setCountryCode(this.getCountryCode());
		copy.setId(this.getId());
		copy.setReportingTypeId(this.getReportingTypeId());
		return copy;
	}

	/**
	 * Provides toString implementation.
	 * 
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();

		sb.append("advertiserId: " + this.getAdvertiserId() + ", ");
		sb.append("campaignName: " + this.getCampaignName() + ", ");
		sb.append("campaignTypeId: " + this.getCampaignTypeId() + ", ");
		sb.append("campaignUrl: " + this.getCampaignUrl() + ", ");
		sb.append("campaignValue: " + this.getCampaignValue() + ", ");
		sb.append("countryCode: " + this.getCountryCode() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("reportingTypeId: " + this.getReportingTypeId());
		return sb.toString();
	}

	/**
	 * Equals implementation.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat
	 *            Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;

		if (this == aThat) {
			return true;
		}

		if (aThat instanceof HibernateProxy) {
			// narrow down the proxy to the class we are dealing with.
			try {
				proxyThat = ((HibernateProxy) aThat)
						.getHibernateLazyInitializer().getImplementation();
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
			}
		}
		if (aThat == null) {
			return false;
		}

		final Countryurlcampaign that;
		try {
			that = (Countryurlcampaign) proxyThat;
			if (!(that.getClassType().equals(this.getClassType()))) {
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
			return false;
		} catch (ClassCastException e) {
			return false;
		}

		boolean result = true;
		result = result
				&& (((this.getId() == null) && (that.getId() == null)) || (this
						.getId() != null && this.getId().equals(that.getId())));
		result = result
				&& (((getAdvertiserId() == null) && (that.getAdvertiserId() == null)) || (getAdvertiserId() != null && getAdvertiserId()
						.equals(that.getAdvertiserId())));
		result = result
				&& (((getCampaignName() == null) && (that.getCampaignName() == null)) || (getCampaignName() != null && getCampaignName()
						.equals(that.getCampaignName())));
		result = result
				&& (((getCampaignTypeId() == null) && (that.getCampaignTypeId() == null)) || (getCampaignTypeId() != null && getCampaignTypeId()
						.equals(that.getCampaignTypeId())));
		result = result
				&& (((getCampaignUrl() == null) && (that.getCampaignUrl() == null)) || (getCampaignUrl() != null && getCampaignUrl()
						.equals(that.getCampaignUrl())));
		result = result
				&& (((getCampaignValue() == null) && (that.getCampaignValue() == null)) || (getCampaignValue() != null && getCampaignValue()
						.equals(that.getCampaignValue())));
		result = result
				&& (((getCountryCode() == null) && (that.getCountryCode() == null)) || (getCountryCode() != null && getCountryCode()
						.equals(that.getCountryCode())));
		result = result
				&& (((getReportingTypeId() == null) && (that
						.getReportingTypeId() == null)) || (getReportingTypeId() != null && getReportingTypeId()
						.equals(that.getReportingTypeId())));
		return result;
	}

	/**
	 * Calculate the hashcode.
	 * 
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if (this.hashCode == null) {
			synchronized (this) {
				if (this.hashCode == null) {
					Long newHashCode = null;

					if (getId() != null) {
						newHashCode = SAVED_HASHES.get(getId());
					}

					if (newHashCode == null) {
						if (getId() != null && getId() != 0L) {
							newHashCode = getId();
						} else {
							newHashCode = (long) super.hashCode();

						}
					}

					this.hashCode = newHashCode;
				}
			}
		}
		return (int) (this.hashCode & 0xffffff);
	}

}
