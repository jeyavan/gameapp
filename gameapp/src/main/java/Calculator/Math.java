package Calculator;

import org.springframework.stereotype.Component;

@Component
public class Math {
public void mul() {
	int a=20;
	int b=30;
	int c=a*b;
	System.out.println("Multiplication: "+c);
}
}
