package com.cm.rotator.domain.rotator.model.dao.rotator.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import com.cm.rotator.domain.rotator.model.obj.rotator.Rotatordestinationpath;
import org.springframework.stereotype.Repository;
import com.cm.rotator.domain.rotator.model.dao.rotator.RotatordestinationpathDao;
 
 
/**
 * DAO for table: Rotatordestinationpath.
 * @author autogenerated
 */
@Repository
public class RotatordestinationpathDaoImpl extends GenericHibernateDaoImpl<Rotatordestinationpath, Integer> implements RotatordestinationpathDao {
	
	/** Constructor method. */
		public RotatordestinationpathDaoImpl() {
			super(Rotatordestinationpath.class);
		}
	}

