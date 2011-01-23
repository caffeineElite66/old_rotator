package com.cm.rotator.domain.rotator.model.obj.rotator;

import com.cm.rotator.domain.rotator.model.obj.rotator.iface.IRotator;
import com.felees.hbnpojogen.persistence.IPojoGenEntity;
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
 * Object mapping for hibernate-handled table: Rotator.
 * @author autogenerated
 */

@Entity
@Table(name = "Rotator", catalog = "rotator")
public class Rotator implements Cloneable, Serializable, IPojoGenEntity, IRotator {

	/** Serial Version UID. */
	private static final long serialVersionUID = -559008639L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Boolean active;
	/** Field mapping. */
	private Date createdAt;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String rotatorName;
	/** Field mapping. */
	private Date updatedAt;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Rotator() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Rotator(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param active Boolean object;
	 * @param createdAt Date object;
	 * @param id Integer object;
	 * @param rotatorName String object;
	 * @param updatedAt Date object;
	 */
	public Rotator(Boolean active, Date createdAt, Integer id, 					
			String rotatorName, Date updatedAt) {

		this.active = active;
		this.createdAt = createdAt;
		this.id = id;
		this.rotatorName = rotatorName;
		this.updatedAt = updatedAt;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Rotator.class;
	}
 

    /**
     * Return the value associated with the column: active.
	 * @return A Boolean object (this.active)
	 */
	@Column( nullable = false  )
	public Boolean isActive() {
		return this.active;
		
	}
	

  
    /**  
     * Set the value related to the column: active.
	 * @param active the active value you wish to set
	 */
	public void setActive(final Boolean active) {
		this.active = active;
	}

    /**
     * Return the value associated with the column: createdAt.
	 * @return A Date object (this.createdAt)
	 */
	@Column( name = "created_at", nullable = false  )
	public Date getCreatedAt() {
		return this.createdAt;
		
	}
	

  
    /**  
     * Set the value related to the column: createdAt.
	 * @param createdAt the createdAt value you wish to set
	 */
	public void setCreatedAt(final Date createdAt) {
		this.createdAt = createdAt;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column( name = "id", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
			SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: rotatorName.
	 * @return A String object (this.rotatorName)
	 */
	@Column( name = "rotator_name", nullable = false, length = 100  )
	public String getRotatorName() {
		return this.rotatorName;
		
	}
	

  
    /**  
     * Set the value related to the column: rotatorName.
	 * @param rotatorName the rotatorName value you wish to set
	 */
	public void setRotatorName(final String rotatorName) {
		this.rotatorName = rotatorName;
	}

    /**
     * Return the value associated with the column: updatedAt.
	 * @return A Date object (this.updatedAt)
	 */
	@Column( name = "updated_at", nullable = false  )
	public Date getUpdatedAt() {
		return this.updatedAt;
		
	}
	

  
    /**  
     * Set the value related to the column: updatedAt.
	 * @param updatedAt the updatedAt value you wish to set
	 */
	public void setUpdatedAt(final Date updatedAt) {
		this.updatedAt = updatedAt;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Rotator clone() throws CloneNotSupportedException {
		
        final Rotator copy = (Rotator)super.clone();

		copy.setActive(this.isActive());
		copy.setCreatedAt(this.getCreatedAt());
		copy.setId(this.getId());
		copy.setRotatorName(this.getRotatorName());
		copy.setUpdatedAt(this.getUpdatedAt());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("active: " + this.isActive() + ", ");
		sb.append("createdAt: " + this.getCreatedAt() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("rotatorName: " + this.getRotatorName() + ", ");
		sb.append("updatedAt: " + this.getUpdatedAt());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Rotator that; 
		try {
			that = (Rotator) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((isActive() == null) && (that.isActive() == null)) || (isActive() != null && isActive().equals(that.isActive())));
		result = result && (((getCreatedAt() == null) && (that.getCreatedAt() == null)) || (getCreatedAt() != null && getCreatedAt().equals(that.getCreatedAt())));
		result = result && (((getRotatorName() == null) && (that.getRotatorName() == null)) || (getRotatorName() != null && getRotatorName().equals(that.getRotatorName())));
		result = result && (((getUpdatedAt() == null) && (that.getUpdatedAt() == null)) || (getUpdatedAt() != null && getUpdatedAt().equals(that.getUpdatedAt())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
						newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {
							newHashCode = super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}