package com.cn.rotator.domain.dom;

import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.*;

import org.hibernate.proxy.HibernateProxy;

/**
 * Object mapping for hibernate-handled table: RotatorDestinationPath.
 * 
 * @author autogenerated
 */

@Entity
@Table(name = "RotatorDestinationPath", catalog = "rotator")
public class RotatorDestinationPath implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559008637L;

	/**
	 * Use a WeakHashMap so entries will be garbage collected once all entities
	 * referring to a saved hash are garbage collected themselves.
	 */
	private static final Map<Serializable, Integer> SAVED_HASHES = Collections
			.synchronizedMap(new WeakHashMap<Serializable, Integer>());

	/** hashCode temporary storage. */
	private volatile Integer hashCode;

	/** Field mapping. */
	private Boolean active;
	/** Field mapping. */
	private Date createdAt;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String pathName;
	/** Field mapping. */
	private java.math.BigDecimal pathPercent;
	/** Field mapping. */
    @ManyToOne
	private Rotator rotator;
	/** Field mapping. */
	private Date updatedAt;
	/** Field mapping. */
	private String url;

	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public RotatorDestinationPath() {
		// Default constructor
	}

	/**
	 * Constructor taking a given ID.
	 * 
	 * @param id
	 *            to set
	 */
	public RotatorDestinationPath(Integer id) {
		this.id = id;
	}

	/**
	 * Return the type of this class. Useful for when dealing with proxies.
	 * 
	 * @return Defining class.
	 */
	@Transient
	public Class<?> getClassType() {
		return RotatorDestinationPath.class;
	}

	/**
	 * Return the value associated with the column: active.
	 * 
	 * @return A Boolean object (this.active)
	 */
	@Column(nullable = false)
	public Boolean isActive() {
		return this.active;

	}

	/**
	 * Set the value related to the column: active.
	 * 
	 * @param active
	 *            the active value you wish to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
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
	 * @return A Integer object (this.id)
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	public Integer getId() {
		return this.id;

	}

	/**
	 * Set the value related to the column: id.
	 * 
	 * @param id
	 *            the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ((this.id == null || this.id == 0) && (id != null)
				&& (this.hashCode != null)) {
			SAVED_HASHES.put(id, this.hashCode);
		}
		this.id = id;
	}

	/**
	 * Return the value associated with the column: pathName.
	 * 
	 * @return A String object (this.pathName)
	 */
	@Column(name = "path_name", nullable = false, length = 50)
	public String getPathName() {
		return this.pathName;

	}

	/**
	 * Set the value related to the column: pathName.
	 * 
	 * @param pathName
	 *            the pathName value you wish to set
	 */
	public void setPathName(final String pathName) {
		this.pathName = pathName;
	}

	/**
	 * Return the value associated with the column: pathPercent.
	 * 
	 * @return A java.math.BigDecimal object (this.pathPercent)
	 */
	@Column(name = "path_percent", nullable = false)
	public java.math.BigDecimal getPathPercent() {
		return this.pathPercent;

	}

	/**
	 * Set the value related to the column: pathPercent.
	 * 
	 * @param pathPercent
	 *            the pathPercent value you wish to set
	 */
	public void setPathPercent(final java.math.BigDecimal pathPercent) {
		this.pathPercent = pathPercent;
	}

	/**
	 * Return the value associated with the column: rotatorId.
	 * 
	 * @return A Long object (this.rotatorId)
	 */
	@Column(name = "rotator_id", nullable = false)
	public Rotator getRotator() {
		return this.rotator;

	}

	public void setRotator(Rotator rotator) {
		this.rotator = rotator;
	}

	/**
	 * Return the value associated with the column: updatedAt.
	 * 
	 * @return A Date object (this.updatedAt)
	 */
	@Column(name = "updated_at", nullable = false)
	public Date getUpdatedAt() {
		return this.updatedAt;

	}

	/**
	 * Set the value related to the column: updatedAt.
	 * 
	 * @param updatedAt
	 *            the updatedAt value you wish to set
	 */
	public void setUpdatedAt(final Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * Return the value associated with the column: url.
	 * 
	 * @return A String object (this.url)
	 */
	@Column(nullable = false, length = 512)
	public String getUrl() {
		return this.url;

	}

	/**
	 * Set the value related to the column: url.
	 * 
	 * @param url
	 *            the url value you wish to set
	 */
	public void setUrl(final String url) {
		this.url = url;
	}


}
