package com.Nive.gameapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nive.gameapp.Business.Business;


@RestController
public class Controller {
	@Autowired
	private Business business;
	 @GetMapping("/sub")
		public long displaysub() {
		return business.sub();
		}
}
