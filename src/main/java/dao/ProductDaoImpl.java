package dao;
import api.ProductDao;
import entity.Product;
import entity.parser.ProductParser;
import util.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private final String nameFile;
    private final String productType;

    public ProductDaoImpl(String nameFile, String productType) throws IOException {
        this.nameFile = nameFile;
        this.productType=productType;
        FileUtils.createFile(nameFile);
    }
    @Override
    public void saveProduct(Product product) throws IOException {
        List<Product> productList =getAllProducts();
        productList.add(product);
        saveProduct(productList);
    }
    @Override
    public void saveProduct(List<Product> products) throws IOException {
        FileUtils.clearFile(nameFile);
        FileOutputStream fileOutputStream = new FileOutputStream(nameFile);
        PrintWriter printWriter=new PrintWriter(fileOutputStream);
        List<Product> listOfProducts=getAllProducts();
        for(Product product:listOfProducts){
            printWriter.write(product.toString()+"\n");
        }
        printWriter.close();
        fileOutputStream.close();
    }
    @Override
    public void removeProductById(Long productId) throws IOException {
        List<Product> listOfProducts = this.getAllProducts();
        for(int i=0; i<listOfProducts.size(); i++){
            if(listOfProducts.get(i).getId().equals(productId)){
                listOfProducts.remove(i);
            }
        }
        saveProduct(listOfProducts);
    }
    @Override
    public void removeProductByName(String productName) throws IOException {
        List<Product> listOfProducts = this.getAllProducts();
        for(int i=0; i<listOfProducts.size(); i++){
            if(listOfProducts.get(i).getProductName().equals(productName)){
                listOfProducts.remove(i);
            }
        }
        saveProduct(listOfProducts);
    }
    @Override
    public List<Product> getAllProducts() throws IOException {
        FileReader fileReader = new FileReader(nameFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<Product> listOfProducts=new ArrayList<Product>();
        String line = bufferedReader.readLine();
        while(line!=null){
            listOfProducts.add(ProductParser.productParser(line,productType));
            line=bufferedReader.readLine();
        }
        bufferedReader.close();
        fileReader.close();
        return listOfProducts;
    }
    @Override
    public Product getProductById(Long productId) throws IOException {
        List<Product> listOfProducts = this.getAllProducts();
        for(Product product:listOfProducts){
            if(product.getId().equals(productId)){
                return product;
            }
        }
        return null;
    }
    @Override
    public Product getProductByProductName(String productName) throws IOException {
        List<Product> listOfProducts=this.getAllProducts();
        for(Product product:listOfProducts){
            if(product.getProductName().equals(productName)){
                return product;
            }
        }
        return null;
    }
}