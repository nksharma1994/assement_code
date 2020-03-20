package com.ecom.ecom.repository;

import com.ecom.ecom.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

    Products findBySku(String skuCode);

    @Query("SELECT p from Products as p GROUP BY p.color")
    List<Products> findProductsGroupByColor();

    @Query("SELECT p from Products as p GROUP BY p.size")
    List<Products> findProductsGroupBySize();

    @Query("SELECT p from Products as p GROUP BY p.brand")
    List<Products> findProductsGroupByBrand();

    @Query("SELECT p from Products as p GROUP BY p.price")
    List<Products> findProductsGroupByPrice();

    @Query(value = "SELECT p.name, count(p.name) from Products p where p.seller = ?1",
    nativeQuery = true)
    Long countProductBySeller(int sellerId);

}
