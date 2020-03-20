package com.ecom.ecom.repository;

import com.ecom.ecom.entity.ClusterTwoProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterTwoProductsRepository extends JpaRepository<ClusterTwoProducts, Long> {
}
