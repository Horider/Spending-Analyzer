package com.example.Spending.Analyzer.Entity.FoodProducts;

import com.example.Spending.Analyzer.Entity.Products;
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
public class FishAndSeafood extends Products {

    @Id
    private Long id;

    @Embedded
    private Products products;
}
