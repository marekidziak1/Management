package entity.parser;

import entity.Boots;
import entity.Cloth;
import entity.Product;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class ProductParser {
    public static Product productParser(String line, String productType) {
        String[] values = line.split(Product.productRegex);

        if (productType.equals("PRODUCT")) {
            return ProductParser.parseProduct(values);
        } else if (productType.equals("CLOTH")) {
            return ProductParser.parseCloth(values);
        } else if (productType.equals("BOOTS")) {
            return ProductParser.parseBoots(values);
        }
        return null;
    }
    private static Product parseProduct(String [] values){
        Long id = Long.parseLong(values[0]);
        String productName = values[1];
        Float price = Float.parseFloat(values[2]);
        Float weight = Float.parseFloat(values[3]);
        String color = values[4];
        Integer productCount = Integer.parseInt(values[5]);
        return new Product(id,productName,price,weight,color,productCount);
    }
    private static Product parseCloth(String []values){
        Long id = Long.parseLong(values[0]);
        String productName = values[1];
        Float price = Float.parseFloat(values[2]);
        Float weight = Float.parseFloat(values[3]);
        String color = values[4];
        Integer productCount = Integer.parseInt(values[5]);
        String size = values[6];
        String material = values[7];
        return new Cloth(id,productName,price,weight,color,productCount,size,material);
    }
    private static Product parseBoots(String []values){
        Long id = Long.parseLong(values[0]);
        String productName = values[1];
        Float price = Float.parseFloat(values[2]);
        Float weight = Float.parseFloat(values[3]);
        String color = values[4];
        Integer productCount = Integer.parseInt(values[5]);
        Integer size = Integer.parseInt(values[6]);
        Boolean isNaturalSkin = Boolean.parseBoolean(values[7]);
        return new Boots(id,productName,price,weight,color,productCount,size,isNaturalSkin);
    }

}






