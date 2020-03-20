package com.ecom.ecom.service;

import com.ecom.ecom.entity.Products;
import com.ecom.ecom.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Products> findAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Products findProductsBySku(String sku) {
        return productsRepository.findBySku(sku);
    }

    @Override
    public List<Products> findProductGroupBy(String groupByName) {
        switch (groupByName) {
            case "COLOR":
                return productsRepository.findProductsGroupByColor();
            case "SIZE":
                return productsRepository.findProductsGroupBySize();
            case "PRICE":
                return productsRepository.findProductsGroupByPrice();
            case "BRAND":
                return productsRepository.findProductsGroupByBrand();
        }
        return null;
    }

    @Override
    public Long countProductsBySeller(int sellerId) {
        return productsRepository.countProductBySeller(sellerId);
    }
}
