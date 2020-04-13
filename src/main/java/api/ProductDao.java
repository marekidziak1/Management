package api;
import entity.Product;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
public interface ProductDao {
    public void saveProduct(Product product) throws IOException;
    public void saveProduct(List<Product> products) throws IOException;
    public void removeProductById(Long productId)throws IOException;
    public void removeProductByName(String productName)throws IOException;
    public List<Product> getAllProducts() throws IOException;
    public Product getProductById(Long ProductId)throws IOException;
    public Product getProductByProductName(String productName)throws IOException;
}
