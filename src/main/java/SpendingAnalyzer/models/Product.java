package SpendingAnalyzer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
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
@Entity
@Table(name = "product")
public class Product {

    private String name;
    private LocalDateTime date;
    private Integer theAmount;
}
