package com.gxl.dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;



@Component
public class DubboHelloService {

	@Reference
	private HelloService helloService;
	
	public String  useUser() {
		return helloService.hello("world");
	}
}
