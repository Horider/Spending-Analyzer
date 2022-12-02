package SpendingAnalyzer;

import SpendingAnalyzer.models.Product;
import SpendingAnalyzer.models.savings.Deposit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class SpendingAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpendingAnalyzerApplication.class, args);

		Deposit deposit = Deposit.builder()
				.product(Product.builder()
						.name("Счет в Сбербанке")
						.theAmount(10000)
						.date(LocalDateTime.now())
						.build())
				.build();

		System.out.println(deposit);
	}

}
