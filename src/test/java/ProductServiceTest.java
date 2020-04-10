
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import entity.Product;
import entity.Boots;
import entity.Cloth;
import service.ProductServiceImpl;

public class ProductServiceTest {
    @Test
    public void getAllProductsPositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        List<Product> productListTest = productService.getAllProducts();
        //expected;
        Assert.assertEquals(productList,productListTest);
    }
    @Test
    public void getAllProductsNegativeTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService=new ProductServiceImpl(new ArrayList<Product>(productList));
        productList.add(new Cloth(3l, "Spodnie", 44.f, 0.f, "White", 3, "S", "COTTON"));
        final List<Product> productListTest = productService.getAllProducts();
        //expected
        Assert.assertNotEquals(productList,productListTest);
    }
    @Test
    public void getCountOfProductFromListPositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final int result = productService.getCountOfProductsFromList();
        //expected
        Assert.assertEquals(3, result);
    }
    @Test
    public void getCountOfProductsFromListZeroTest(){
        //is
        ProductServiceImpl productService = new ProductServiceImpl();
        //then
        final int result= productService.getCountOfProductsFromList();
        //expected
        Assert.assertEquals(0,result);
    }
    @Test
    public void getProductPositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final Product productTest = productService.getProduct("T-Shirt");
        //expected
        Assert.assertEquals(product1, productTest);
    }
    @Test
    public void getProductNegativeTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final Product result = productService.getProduct("Produkt");
        //expected
        Assert.assertNotEquals(product1,result);
    }
    @Test
    public void isGreaterThanZeroPositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final boolean result = productService.isGreaterThanZero("T-Shirt");
        //expected
        Assert.assertTrue(result);
    }
    @Test
    public void isGreaterThanZeroNegativeTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",0,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final boolean result = productService.isGreaterThanZero("T-Shirt");
        //expected
        Assert.assertFalse(result);
    }
    @Test
    public void isProductExistByNamePositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final boolean result = productService.isProductExistByName("T-Shirt");
        //expected
        Assert.assertTrue(result);
    }
    @Test
    public void isProductExistByNameNegativeTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService=new ProductServiceImpl(productList);
        final boolean result = productService.isProductExistByName("Produkt");
        //expected
        Assert.assertFalse(result);
    }
    @Test
    public void isProductExistByIdPositiveTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService = new ProductServiceImpl(productList);
        final boolean result = productService.isProductExistById(1L);
        //expected
        Assert.assertTrue(result);
    }
    @Test
    public void isProductExistByIdNegativeTest(){
        //is
        List<Product> productList = new ArrayList<Product>();
        Product product1=new Cloth(1L,"T-Shirt",13.5F,100F,"Blue",10,"XL","Cotton" );
        Product product2=new Cloth(2L,"Cardigan",45F,300F,"Green",70,"L","Cotton" );
        Product product3=new Boots(3L,"Sandals",20.6F,400F,"White",100,38,true );
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        //then
        ProductServiceImpl productService= new ProductServiceImpl(productList);
        final boolean result= productService.isProductExistById(17L);
        //expected
        Assert.assertFalse(result);
    }

}
