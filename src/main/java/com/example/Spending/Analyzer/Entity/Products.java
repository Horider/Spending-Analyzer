package com.example.Spending.Analyzer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

/**
 * @author Horider@yandex.ru (Александр)
 * @version 1.0
 * @date 17.11.2022 23:10
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Products {

    private String name;
    private LocalDateTime date;
    private int amount;
}
