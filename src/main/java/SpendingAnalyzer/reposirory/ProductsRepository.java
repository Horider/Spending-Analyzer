package SpendingAnalyzer.reposirory;

import SpendingAnalyzer.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {

    void deleteById(Integer id);

    Product findProductsBy(Integer id);

    Product findByName(String name);
}
