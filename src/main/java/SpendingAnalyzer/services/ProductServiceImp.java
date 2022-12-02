package SpendingAnalyzer.services;

import SpendingAnalyzer.models.Product;
import SpendingAnalyzer.reposirory.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductServiceImp implements ProductService {

    private final ProductsRepository productsRepository;

    @Autowired
    public ProductServiceImp(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        productsRepository.save(product);
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        //TO DO;
    }

    @Override
    public List<Product> findAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    @Transactional
    public void removeProductById(Integer id) {
        productsRepository.deleteById(id);
    }

    @Override
    public Product findProductById(Integer id) {
        return productsRepository.findProductsBy(id);
    }

    @Override
    public Product findByName(String name) {
        return productsRepository.findByName(name);
    }
}
