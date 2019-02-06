package com.sletras;

import com.sletras.controllers.ConstructorInjectedController;
import com.sletras.controllers.Controller;
import com.sletras.controllers.PropertyInjectedController;
import com.sletras.controllers.SetterInjectedController;
import com.sletras.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);


		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(Controller.class).sayHello());
	}

}

