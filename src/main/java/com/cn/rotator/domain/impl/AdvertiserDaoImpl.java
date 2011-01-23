package com.cm.rotator.domain.rotator.model.dao.rotator.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.cm.rotator.domain.rotator.model.obj.rotator.Advertiser;
import org.springframework.stereotype.Repository;
import com.cm.rotator.domain.rotator.model.dao.rotator.AdvertiserDao;
 
 
/**
 * DAO for table: Advertiser.
 * @author autogenerated
 */
@Repository
public class AdvertiserDaoImpl extends GenericHibernateDaoImpl<Advertiser, Long> implements AdvertiserDao {
	
	/** Constructor method. */
		public AdvertiserDaoImpl() {
			super(Advertiser.class);
		}
	}

