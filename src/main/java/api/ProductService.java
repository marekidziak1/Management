package api;

import entity.Product;
import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Integer getCountOfProductsFromList();
    public Product getProduct(String productName);
    public boolean isGreaterThanZero(String productName);
    public boolean isProductExistByName(String productName);
    public boolean isProductExistById(Long Id);
}
