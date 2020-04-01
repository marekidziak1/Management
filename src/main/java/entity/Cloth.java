package entity;

public class Cloth extends Product {
    String size;
    String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, Integer productCount, String size, String material) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }
    /*
    public void setSize(String size) {
        this.size = size;
    }
    */
    public String getSize() {
        return size;
    }
    /*
    public void setMaterial(String material) {
        this.material=material;
    }
     */
    public String getMaterial(){
        return material;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
