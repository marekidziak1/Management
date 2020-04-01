package entity;

public class Boots extends Product {
    private int size;
    boolean isNaturalSkin ;
    public Boots(Long id, String productName, Float price, Float weight, String color, Integer productCount, Integer size, boolean isNaturalSkin){
        super(id,productName,price,weight,color,productCount);
        this.size=size;
        this.isNaturalSkin=isNaturalSkin;
    }
    /*
    public void setSize(int size){
        this.size=size;
    }
     */
    public int getSize(){
        return size;
    }
    /*
    public void setNaturalSkin(boolean isNaturalSkin){
        this.isNaturalSkin=isNaturalSkin;
    }
     */
    public boolean getNaturalSkin(){
        return isNaturalSkin;
    }

    @Override
    public String toString() {
        return super.toString()+ "Boots{" +
                "size=" + size +
                ", isNaturalSkin=" + isNaturalSkin +
                '}';
    }
}
