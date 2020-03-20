package com.ecom.ecom.service;

import com.ecom.ecom.entity.Products;

import java.util.List;

public interface ProductsService {

    public List<Products> findAllProducts();
    public Products findProductsBySku(String sku);
    public List<Products> findProductGroupBy(String groupBy);
    public Long countProductsBySeller(int sellerId);
}
