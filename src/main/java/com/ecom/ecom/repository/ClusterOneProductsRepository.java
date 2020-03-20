package com.ecom.ecom.repository;

import com.ecom.ecom.entity.ClusterOneProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterOneProductsRepository extends JpaRepository<ClusterOneProducts, Long> {
}
