package com.xworkz.stabilizer.dao;

import com.xworkz.stabilizer.entity.IPLEntity;

public class IPLDAOImpl implements IPLDAO {

	public void save(IPLEntity entity) {
		System.out.println("invoked IPLDAOImpl , save" + entity);
		System.out.println("should impl hibernate");
	}

}
