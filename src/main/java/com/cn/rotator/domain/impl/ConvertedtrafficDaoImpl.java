package com.cm.rotator.domain.rotator.model.dao.rotator.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.cm.rotator.domain.rotator.model.obj.rotator.Convertedtraffic;
import org.springframework.stereotype.Repository;
import com.cm.rotator.domain.rotator.model.dao.rotator.ConvertedtrafficDao;
 
 
/**
 * DAO for table: Convertedtraffic.
 * @author autogenerated
 */
@Repository
public class ConvertedtrafficDaoImpl extends GenericHibernateDaoImpl<Convertedtraffic, Long> implements ConvertedtrafficDao {
	
	/** Constructor method. */
		public ConvertedtrafficDaoImpl() {
			super(Convertedtraffic.class);
		}
	}

