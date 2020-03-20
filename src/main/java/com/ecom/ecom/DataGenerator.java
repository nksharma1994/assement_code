package com.ecom.ecom;

import com.ecom.ecom.entity.*;
import com.ecom.ecom.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DataGenerator {

    @Autowired
    private ClusterOneCategoryRepository clusterOneCategoryRepository;

    @Autowired
    private ClusterOneSellerRepository clusterOneSellerRepository;

    @Autowired
    private ClusterOneProductsRepository clusterOneProductsRepository;

    @Autowired
    private ClusterTwoCategoryRepository clusterTwoCategoryRepository;

    @Autowired
    private ClusterTwoSellerRepository clusterTwoSellerRepository;

    @Autowired
    private ClusterTwoProductsRepository clusterTwoProductsRepository;

    @PostConstruct
    public void init(){
        ClusterOneCategory clusterOneCategory = new ClusterOneCategory();
        clusterOneCategory.setName("T-Shirt");

        ClusterOneCategory clusterOneCategory1 = new ClusterOneCategory();
        clusterOneCategory1.setName("Jeans");
        clusterOneCategoryRepository.save(clusterOneCategory);
        clusterOneCategoryRepository.save(clusterOneCategory1);

        ClusterTwoCategory clusterTwoCategory = new ClusterTwoCategory();
        clusterTwoCategory.setName("Shirt");

        ClusterTwoCategory clusterTwoCategory1= new ClusterTwoCategory();
        clusterTwoCategory1.setName("Pants");

        clusterTwoCategoryRepository.save(clusterTwoCategory);
        clusterTwoCategoryRepository.save(clusterTwoCategory1);


        ClusterOneSeller clusterOneSeller = new ClusterOneSeller();
        ClusterOneSeller clusterOneSeller1 = new ClusterOneSeller();
        clusterOneSeller.setName("Seller One");
        clusterOneSeller1.setName("Seller Two");
        clusterOneSeller.setDescription("Seller One Description");
        clusterOneSeller1.setDescription("Seller Two Description");
        clusterOneSellerRepository.save(clusterOneSeller);
        clusterOneSellerRepository.save(clusterOneSeller1);

        ClusterTwoSeller clusterTwoSeller = new ClusterTwoSeller();
        ClusterTwoSeller clusterTwoSeller1 = new ClusterTwoSeller();
        clusterTwoSeller.setName("Seller Three");
        clusterTwoSeller1.setName("Seller Four");
        clusterTwoSeller.setDescription("Seller Three Description");
        clusterTwoSeller1.setDescription("Seller Four Description");
        clusterTwoSellerRepository.save(clusterTwoSeller);
        clusterTwoSellerRepository.save(clusterTwoSeller1);

        ClusterOneProducts clusterOneProducts = new ClusterOneProducts();
        ClusterOneProducts clusterOneProducts1 = new ClusterOneProducts();
        clusterOneProducts.setName("Round Neck T-shirt");
        clusterOneProducts.setBrand("NIKE");
        clusterOneProducts.setColor("Blue");
        clusterOneProducts.setPrice(2000.00);
        clusterOneProducts.setSize("40");
        clusterOneProducts.setCategory(clusterOneCategory);
        clusterOneProducts.setSeller(clusterOneSeller);
        clusterOneProducts.setSku(generateSKUCode(clusterOneProducts.getBrand(), clusterOneProducts.getCategory().getName(), clusterOneProducts.getColor(), clusterOneProducts.getSize()));

        clusterOneProducts1.setName("Jeans Regular Fit");
        clusterOneProducts1.setBrand("Tommy");
        clusterOneProducts1.setColor("BLUE");
        clusterOneProducts1.setPrice(10000.00);
        clusterOneProducts1.setSize("32");
        clusterOneProducts1.setCategory(clusterOneCategory1);
        clusterOneProducts1.setSeller(clusterOneSeller1);
        clusterOneProducts1.setSku(generateSKUCode(clusterOneProducts1.getBrand(), clusterOneProducts1.getCategory().getName(), clusterOneProducts1.getColor(), clusterOneProducts1.getSize()));

        ClusterTwoProducts clusterTwoProducts = new ClusterTwoProducts();
        ClusterTwoProducts clusterTwoProducts1 = new ClusterTwoProducts();
        clusterTwoProducts.setName("Formal Shirt");
        clusterTwoProducts.setBrand("Raymond");
        clusterTwoProducts.setColor("WHITE");
        clusterTwoProducts.setPrice(2000.00);
        clusterTwoProducts.setSize("44");
        clusterTwoProducts.setCategory(clusterTwoCategory);
        clusterTwoProducts.setSeller(clusterTwoSeller);
        clusterTwoProducts.setSku(generateSKUCode(clusterTwoProducts.getBrand(), clusterTwoProducts.getCategory().getName(), clusterTwoProducts.getColor(), clusterTwoProducts.getSize()));

        clusterTwoProducts1.setName("Formal Pants");
        clusterTwoProducts1.setBrand("BlackBeery");
        clusterTwoProducts1.setColor("BLACK");
        clusterTwoProducts1.setPrice(2500.00);
        clusterTwoProducts1.setSize("36");
        clusterTwoProducts1.setCategory(clusterTwoCategory1);
        clusterTwoProducts1.setSeller(clusterTwoSeller1);
        clusterTwoProducts1.setSku(generateSKUCode(clusterTwoProducts1.getBrand(), clusterTwoProducts1.getCategory().getName(), clusterTwoProducts1.getColor(), clusterTwoProducts1.getColor()));

        clusterOneProductsRepository.save(clusterOneProducts);
        clusterOneProductsRepository.save(clusterOneProducts1);
        clusterTwoProductsRepository.save(clusterTwoProducts);
        clusterTwoProductsRepository.save(clusterTwoProducts1);
    }

    public String generateSKUCode(String brand, String category, String color, String size){
        String skuCode = "";
        skuCode = skuCode.concat(brand.substring(0,1)).concat(category.substring(0,1)).concat(size.substring(0,1)).concat(color.substring(0,1));
        return skuCode;
    }

}
