package com.yc.shoesMall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class shopAction {
	@RequestMapping("shop")
	public String shop() {
		
		return "shop";
	}
}