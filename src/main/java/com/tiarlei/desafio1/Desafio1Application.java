package com.tiarlei.desafio1;

import com.tiarlei.desafio1.entities.Order;
import com.tiarlei.desafio1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		System.out.println();

		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Exemplo 1:");
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " +orderService.total(order));

		System.out.println();

		Order order2 = new Order(2282, 800.00, 10.0);
		System.out.println("Exemplo 2:");
		System.out.println("Pedido código " + order2.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order2));

		System.out.println();

		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.println("Exemplo 2:");
		System.out.println("Pedido código " + order3.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order3));

	}
}