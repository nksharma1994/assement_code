package com.ecom.ecom.repository;

import com.ecom.ecom.entity.ClusterTwoCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterTwoCategoryRepository extends JpaRepository<ClusterTwoCategory, Long> {

}
