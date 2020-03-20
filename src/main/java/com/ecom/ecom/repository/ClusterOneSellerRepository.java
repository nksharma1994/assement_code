package com.ecom.ecom.repository;

import com.ecom.ecom.entity.ClusterOneSeller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterOneSellerRepository extends JpaRepository<ClusterOneSeller, Long> {
}
