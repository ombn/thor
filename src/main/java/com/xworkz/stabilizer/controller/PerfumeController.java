package com.xworkz.stabilizer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/") // root/context request is mapped
// http://localhost:8080/com.xworkz.stabilizer/save.odc
public class PerfumeController {

	public PerfumeController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/save.odc")
	public String submittedSave(@RequestParam String brand, @RequestParam int qty, @RequestParam String type,
			@RequestParam String gender) {
		System.out.println("invoked submittedSave");
		System.out.println(brand);
		System.out.println(qty);
		System.out.println(type);
		System.out.println(gender);
		return "SaveSuccess";
	}

}
