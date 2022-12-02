package com.example.Spending.Analyzer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Income {

    @Id
    private Long id;
    private int TheAmount;
    private String Name;
}
