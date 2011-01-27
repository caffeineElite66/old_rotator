package com.cn.rotator.domain.dom;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
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
 * Object mapping for hibernate-handled table: ConvertedTraffic.
 * 
 * @author autogenerated
 */

@Entity
@Table(name = "ConvertedTraffic", catalog = "rotator")
public class Convertedtraffic implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559008647L;

	/**
	 * Use a WeakHashMap so entries will be garbage collected once all entities
	 * referring to a saved hash are garbage collected themselves.
	 */
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());

	/** hashCode temporary storage. */
	private volatile Long hashCode;

	/** Field mapping. */
	private Date createdAt;
	/** Field mapping. */
	private Long id = 0L; // init for hibernate bug workaround
	/** Field mapping. */
	private Long rawTrafficId;
	/** Field mapping. */
	private Long requestDataId;
	/** Field mapping. */
	private String tag;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Convertedtraffic() {
		// Default constructor
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param id
	 *            to set
	 */
	public Convertedtraffic(Long id) {
		this.id = id;
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param createdAt
	 *            Date object;
	 * @param id
	 *            Long object;
	 * @param rawTrafficId
	 *            Long object;
	 * @param requestDataId
	 *            Long object;
	 */
	public Convertedtraffic(Date createdAt, Long id, Long rawTrafficId,
			Long requestDataId) {

		this.createdAt = createdAt;
		this.id = id;
		this.rawTrafficId = rawTrafficId;
		this.requestDataId = requestDataId;
	}

	/**
	 * Return the type of this class. Useful for when dealing with proxies.
	 * 
	 * @return Defining class.
	 */
	@Transient
	public Class<?> getClassType() {
		return Convertedtraffic.class;
	}

	/**
	 * Return the value associated with the column: createdAt.
	 * 
	 * @return A Date object (this.createdAt)
	 */
	@Column(name = "created_at", nullable = false)
	public Date getCreatedAt() {
		return this.createdAt;

	}

	/**
	 * Set the value related to the column: createdAt.
	 * 
	 * @param createdAt
	 *            the createdAt value you wish to set
	 */
	public void setCreatedAt(final Date createdAt) {
		this.createdAt = createdAt;
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
	 * Return the value associated with the column: rawTrafficId.
	 * 
	 * @return A Long object (this.rawTrafficId)
	 */
	@Column(name = "raw_traffic_id", nullable = false)
	public Long getRawTrafficId() {
		return this.rawTrafficId;

	}

	/**
	 * Set the value related to the column: rawTrafficId.
	 * 
	 * @param rawTrafficId
	 *            the rawTrafficId value you wish to set
	 */
	public void setRawTrafficId(final Long rawTrafficId) {
		this.rawTrafficId = rawTrafficId;
	}

	/**
	 * Return the value associated with the column: requestDataId.
	 * 
	 * @return A Long object (this.requestDataId)
	 */
	@Column(name = "request_data_id", nullable = false)
	public Long getRequestDataId() {
		return this.requestDataId;

	}

	/**
	 * Set the value related to the column: requestDataId.
	 * 
	 * @param requestDataId
	 *            the requestDataId value you wish to set
	 */
	public void setRequestDataId(final Long requestDataId) {
		this.requestDataId = requestDataId;
	}

	/**
	 * Return the value associated with the column: tag.
	 * 
	 * @return A String object (this.tag)
	 */
	@Column(length = 25)
	public String getTag() {
		return this.tag;

	}

	/**
	 * Set the value related to the column: tag.
	 * 
	 * @param tag
	 *            the tag value you wish to set
	 */
	public void setTag(final String tag) {
		this.tag = tag;
	}

	/**
	 * Deep copy.
	 * 
	 * @return cloned object
	 * @throws CloneNotSupportedException
	 *             on error
	 */
	@Override
	public Convertedtraffic clone() throws CloneNotSupportedException {

		final Convertedtraffic copy = (Convertedtraffic) super.clone();

		copy.setCreatedAt(this.getCreatedAt());
		copy.setId(this.getId());
		copy.setRawTrafficId(this.getRawTrafficId());
		copy.setRequestDataId(this.getRequestDataId());
		copy.setTag(this.getTag());
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

		sb.append("createdAt: " + this.getCreatedAt() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("rawTrafficId: " + this.getRawTrafficId() + ", ");
		sb.append("requestDataId: " + this.getRequestDataId() + ", ");
		sb.append("tag: " + this.getTag());
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

		final Convertedtraffic that;
		try {
			that = (Convertedtraffic) proxyThat;
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
				&& (((getCreatedAt() == null) && (that.getCreatedAt() == null)) || (getCreatedAt() != null && getCreatedAt()
						.equals(that.getCreatedAt())));
		result = result
				&& (((getRawTrafficId() == null) && (that.getRawTrafficId() == null)) || (getRawTrafficId() != null && getRawTrafficId()
						.equals(that.getRawTrafficId())));
		result = result
				&& (((getRequestDataId() == null) && (that.getRequestDataId() == null)) || (getRequestDataId() != null && getRequestDataId()
						.equals(that.getRequestDataId())));
		result = result
				&& (((getTag() == null) && (that.getTag() == null)) || (getTag() != null && getTag()
						.equals(that.getTag())));
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
