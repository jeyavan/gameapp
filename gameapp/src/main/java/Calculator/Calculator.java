package Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	@Autowired
	private Math m;
	@Autowired
	private Math1 m1;
	
	public void display() {
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition value: "+c);
		
	}
	public void cal() {
	   
		m.mul();
		m1.sub();
		
	}

}
