package service;
import api.ProductService;
import entity.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductServiceImpl implements ProductService {
    List<Product> productList;
    public ProductServiceImpl(){
        this.productList=new ArrayList<Product>();
    }
    public ProductServiceImpl(List<Product> productList){
        this.productList=productList;
    }
    @Override
    public List<Product> getAllProducts(){
        return this.productList;
    }
    @Override
    public Integer getCountOfProductsFromList() {
        return productList.size();
    }
    @Override
    public Product getProduct(String productName) {
        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getProductName().equals(productName)) {
                return productList.get(i);
            }
        }
        //SPRAWDZIĆ TO CZY MOŻESZ ZWRACAĆ NULLA -można zwracać nulla
        return null;
    }
    @Override
    public boolean isGreaterThanZero(String productName) {
        for(int i=0; i<productList.size();i++){
            if(productList.get(i).getProductName().equals(productName)){
                return productList.get(i).getProductCount()>0;
            }
        }
        return false;
    }
    @Override
    public boolean isProductExistByName(String productName) {
        for(int i=0; i<productList.size();i++){
            if(productList.get(i).getProductName().equals(productName)){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean isProductExistById(Long Id) {
        for(int i=0; i<productList.size(); i++){
            if(productList.get(i).getId().equals(Id)){
                return true;
            }
        }
        return false;
    }
}
