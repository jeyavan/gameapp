package com.Nive.gameapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import Calculator.Calculator;
@SpringBootApplication
@ComponentScan({"com.Nive.gameapp","Calculator"})
public class GameappApplication {
public static void main(String[] args) {
ConfigurableApplicationContext context = SpringApplication.run(GameappApplication.class, args);
Calculator c=context.getBean(Calculator.class);
c.cal();
c.display();	

}

}
