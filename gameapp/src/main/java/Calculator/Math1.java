package Calculator;

import org.springframework.stereotype.Component;

@Component
public class Math1 {
	public void sub() {
		int a=40;
		int b=30;
		int c=a-b;
		System.out.println("Subraction: "+c);
	}

}
