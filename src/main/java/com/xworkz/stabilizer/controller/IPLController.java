package com.xworkz.stabilizer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.stabilizer.dto.IPLDTO;

@Component
@RequestMapping("/")//root
public class IPLController {

	public IPLController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}
	
	
	@RequestMapping("/iplRegister.odc")
	public String onRegister(IPLDTO ipldto)//@ModelAttribute is optional
	{
		System.out.println("invoked onRegister, this is update using git");
		System.out.println("model attribute is \t"+ipldto);
		
		return "IPL";
	}

}
