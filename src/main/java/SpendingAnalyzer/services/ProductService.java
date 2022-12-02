package SpendingAnalyzer.services;

import SpendingAnalyzer.models.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);

    void updateProduct(Product product);

    List<Product> findAllProducts();

    void removeProductById(Integer id);

    Product findProductById(Integer id);

    Product findByName(String name);
}
