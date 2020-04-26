package com.xworkz.stabilizer.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.xworkz.stabilizer.dao.IPLDAO;
import com.xworkz.stabilizer.dto.IPLDTO;
import com.xworkz.stabilizer.entity.IPLEntity;

@Component
public class IPLServiceImpl implements IPLService {

	private IPLDAO ipldao;

	public IPLServiceImpl() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public boolean saveAndValidate(IPLDTO ipldto) {
		System.out.println("invoked saveAndValidate, checking git");

		System.out.println("do validation ...*");

		boolean flag = false;

		if (flag == true) {
			System.out.println("if data is valid , then save to db using dao");

			IPLEntity entity = new IPLEntity();
			//where is valus ??
			BeanUtils.copyProperties(ipldto, entity);
			ipldao.save(entity);
		}

		return false;
	}

}
