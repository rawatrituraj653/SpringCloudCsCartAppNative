package com.cs.cart.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@RefreshScope
public class CartAppRestController {

	@Value("${my.config.data:default One data}")
	private String data;
	
	@Value("${my.config.msg:default One msg}")
	private String msg; 
	
	@GetMapping("/data")
	public String  getMsg() {
		
		return data+": This is Combined: "+msg;
		
	}
}
