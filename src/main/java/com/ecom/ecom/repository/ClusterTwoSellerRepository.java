package com.ecom.ecom.repository;

import com.ecom.ecom.entity.ClusterTwoSeller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterTwoSellerRepository extends JpaRepository<ClusterTwoSeller, Long> {
}
