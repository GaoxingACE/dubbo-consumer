package com.gxl.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gxl.dubbo.service.DubboHelloService;

@RestController
public class UserController {
	
	@Autowired
	private DubboHelloService helloService;
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return helloService.useUser();
	}

}
