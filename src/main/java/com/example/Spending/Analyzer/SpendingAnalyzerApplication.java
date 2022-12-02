package com.example.Spending.Analyzer;

import com.example.Spending.Analyzer.Entity.Products;
import com.example.Spending.Analyzer.Entity.Savings.Deposit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpendingAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpendingAnalyzerApplication.class, args);

		Deposit deposit = Deposit.builder()
				.products(Products.builder()
						.name("Счет в Сбербанке")
						.amount(10000)
						.date(LocalDateTime.now())
						.build())
				.build();

		System.out.println(deposit);
	}

}
