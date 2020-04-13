package entity;

public class Product {
    public static String productRegex= "#";

    private Long id;
    private String productName;
    private Float price;
    private Float weight;
    private String color;
    private Integer productCount;

    public Product(Long id, String productName, Float price, Float weight, String color, Integer productCount){
        this.id=id;
        this.productName=productName;
        this.price=price;
        this.weight=weight;
        this.color=color;
        this.productCount=productCount;
    }
    public Long getId(){
        return id;
    }
    /*
    public void setProductName(String productName){
        this.productName=productName;
    }
     */
    public String getProductName(){
        return productName;
    }
    public void setPrice(Float price){
        this.price=price;
    }
    public Float getPrice(){
        return price;
    }
    /*
    public void setWeight(Float weight){
        this.weight=weight;
    }
     */
    public Float getWeight(){
        return weight;
    }
    /*
    public void setColor(String color){
        this.color=color;
    }
     */
    public String getColor(){
        return color;
    }
    public void setProductCount(Integer productCount){
        this.productCount=productCount;
    }
    public int getProductCount(){
        return productCount;
    }

    @Override
    public String toString() {
        return id + productRegex
                + productName + productRegex
                + price + productRegex
                + weight + productRegex
                + color + productRegex
                + productCount;
    }
}
