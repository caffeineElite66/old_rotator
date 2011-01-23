package com.cm.rotator.domain.rotator.model.obj.rotator.iface;
import java.util.Date;


/** 
 * Object interface mapping for hibernate-handled table: RawTraffic.
 * @author autogenerated
 */

public interface IRawtraffic {



    /**
     * Return the value associated with the column: countryCode.
	 * @return A String object (this.countryCode)
	 */
	String getCountryCode();
	

  
    /**  
     * Set the value related to the column: countryCode.
	 * @param countryCode the countryCode value you wish to set
	 */
	void setCountryCode(final String countryCode);

    /**
     * Return the value associated with the column: countryUrlCampaignId.
	 * @return A Long object (this.countryUrlCampaignId)
	 */
	Long getCountryUrlCampaignId();
	

  
    /**  
     * Set the value related to the column: countryUrlCampaignId.
	 * @param countryUrlCampaignId the countryUrlCampaignId value you wish to set
	 */
	void setCountryUrlCampaignId(final Long countryUrlCampaignId);

    /**
     * Return the value associated with the column: createdAt.
	 * @return A Date object (this.createdAt)
	 */
	Date getCreatedAt();
	

  
    /**  
     * Set the value related to the column: createdAt.
	 * @param createdAt the createdAt value you wish to set
	 */
	void setCreatedAt(final Date createdAt);

    /**
     * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
	Long getId();
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	void setId(final Long id);

    /**
     * Return the value associated with the column: ip.
	 * @return A String object (this.ip)
	 */
	String getIp();
	

  
    /**  
     * Set the value related to the column: ip.
	 * @param ip the ip value you wish to set
	 */
	void setIp(final String ip);

    /**
     * Return the value associated with the column: publisherId.
	 * @return A Long object (this.publisherId)
	 */
	Long getPublisherId();
	

  
    /**  
     * Set the value related to the column: publisherId.
	 * @param publisherId the publisherId value you wish to set
	 */
	void setPublisherId(final Long publisherId);

    /**
     * Return the value associated with the column: publisherUid.
	 * @return A String object (this.publisherUid)
	 */
	String getPublisherUid();
	

  
    /**  
     * Set the value related to the column: publisherUid.
	 * @param publisherUid the publisherUid value you wish to set
	 */
	void setPublisherUid(final String publisherUid);

    /**
     * Return the value associated with the column: requestDataId.
	 * @return A Long object (this.requestDataId)
	 */
	Long getRequestDataId();
	

  
    /**  
     * Set the value related to the column: requestDataId.
	 * @param requestDataId the requestDataId value you wish to set
	 */
	void setRequestDataId(final Long requestDataId);

	// end of interface
}