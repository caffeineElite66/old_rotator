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
 * Object mapping for hibernate-handled table: Publisher.
 * 
 * @author autogenerated
 */

@Entity
@Table(name = "Publisher", catalog = "rotator")
public class Publisher implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559008643L;

	/**
	 * Use a WeakHashMap so entries will be garbage collected once all entities
	 * referring to a saved hash are garbage collected themselves.
	 */
	private static final Map<Serializable, Long> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Long>());

	/** hashCode temporary storage. */
	private volatile Long hashCode;

	/** Field mapping. */
	private String accountName;
	/** Field mapping. */
	private String accountPassword;
	/** Field mapping. */
	private Long id = 0L; // init for hibernate bug workaround
	/** Field mapping. */
	private String publisherName;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Publisher() {
		// Default constructor
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param id
	 *            to set
	 */
	public Publisher(Long id) {
		this.id = id;
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param accountName
	 *            String object;
	 * @param accountPassword
	 *            String object;
	 * @param id
	 *            Long object;
	 * @param publisherName
	 *            String object;
	 */
	public Publisher(String accountName, String accountPassword, Long id,
			String publisherName) {

		this.accountName = accountName;
		this.accountPassword = accountPassword;
		this.id = id;
		this.publisherName = publisherName;
	}

	/**
	 * Return the type of this class. Useful for when dealing with proxies.
	 * 
	 * @return Defining class.
	 */
	@Transient
	public Class<?> getClassType() {
		return Publisher.class;
	}

	/**
	 * Return the value associated with the column: accountName.
	 * 
	 * @return A String object (this.accountName)
	 */
	@Column(name = "account_name", nullable = false, length = 25)
	public String getAccountName() {
		return this.accountName;

	}

	/**
	 * Set the value related to the column: accountName.
	 * 
	 * @param accountName
	 *            the accountName value you wish to set
	 */
	public void setAccountName(final String accountName) {
		this.accountName = accountName;
	}

	/**
	 * Return the value associated with the column: accountPassword.
	 * 
	 * @return A String object (this.accountPassword)
	 */
	@Column(name = "account_password", nullable = false, length = 25)
	public String getAccountPassword() {
		return this.accountPassword;

	}

	/**
	 * Set the value related to the column: accountPassword.
	 * 
	 * @param accountPassword
	 *            the accountPassword value you wish to set
	 */
	public void setAccountPassword(final String accountPassword) {
		this.accountPassword = accountPassword;
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
	 * Return the value associated with the column: publisherName.
	 * 
	 * @return A String object (this.publisherName)
	 */
	@Column(name = "publisher_name", nullable = false, length = 50)
	public String getPublisherName() {
		return this.publisherName;

	}

	/**
	 * Set the value related to the column: publisherName.
	 * 
	 * @param publisherName
	 *            the publisherName value you wish to set
	 */
	public void setPublisherName(final String publisherName) {
		this.publisherName = publisherName;
	}

	/**
	 * Deep copy.
	 * 
	 * @return cloned object
	 * @throws CloneNotSupportedException
	 *             on error
	 */
	@Override
	public Publisher clone() throws CloneNotSupportedException {

		final Publisher copy = (Publisher) super.clone();

		copy.setAccountName(this.getAccountName());
		copy.setAccountPassword(this.getAccountPassword());
		copy.setId(this.getId());
		copy.setPublisherName(this.getPublisherName());
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

		sb.append("accountName: " + this.getAccountName() + ", ");
		sb.append("accountPassword: " + this.getAccountPassword() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("publisherName: " + this.getPublisherName());
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

		final Publisher that;
		try {
			that = (Publisher) proxyThat;
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
				&& (((getAccountName() == null) && (that.getAccountName() == null)) || (getAccountName() != null && getAccountName()
						.equals(that.getAccountName())));
		result = result
				&& (((getAccountPassword() == null) && (that
						.getAccountPassword() == null)) || (getAccountPassword() != null && getAccountPassword()
						.equals(that.getAccountPassword())));
		result = result
				&& (((getPublisherName() == null) && (that.getPublisherName() == null)) || (getPublisherName() != null && getPublisherName()
						.equals(that.getPublisherName())));
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
