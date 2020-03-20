package com.ecom.ecom.schuduler;

import com.ecom.ecom.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class DataScheduler {
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private ProductsRepository productsRepository;

    @Scheduled(fixedDelay = 7200000)
    public void scheduleDataExtractionFromClusterOne() {
        categoryRepository.saveAll(clusterOneCategoryRepository.findAll());
        sellerRepository.saveAll(clusterOneSellerRepository.findAll());
        productsRepository.saveAll(clusterOneProductsRepository.findAll());
    }

    @Scheduled(fixedDelay = 7200000)
    public void scheduleDataExtractionFromClusterTwo() {
        categoryRepository.saveAll(clusterTwoCategoryRepository.findAll());
        sellerRepository.saveAll(clusterTwoSellerRepository.findAll());
        productsRepository.saveAll(clusterTwoProductsRepository.findAll());
    }


}
