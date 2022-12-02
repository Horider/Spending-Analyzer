package SpendingAnalyzer.models.foodProducts;

import SpendingAnalyzer.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Horider@yandex.ru (Александр)
 * @version 1.0
 * @date 17.11.2022 23:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MeatProduct extends Product {

    @Id
    private Long id;

    @Embedded
    private Product product;
}
