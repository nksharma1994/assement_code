package com.ecom.ecom.repository;

import com.ecom.ecom.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    public Seller findByName(String name);
}
