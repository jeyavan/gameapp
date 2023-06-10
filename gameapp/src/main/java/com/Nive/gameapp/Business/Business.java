package com.Nive.gameapp.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Nive.gameapp.DataService.DataService;

@Component
public class Business {
	@Autowired
	private DataService dataservice;
	public long sub() {
	return dataservice.total();
}
}