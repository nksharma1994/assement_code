package com.ecom.ecom.service;

import com.ecom.ecom.entity.Seller;
import com.ecom.ecom.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public SellerServiceImpl(){
        super();
    }

    @Override
    public List<Seller> getAllSeller() {
        return sellerRepository.findAll();
    }

    @Override
    public Optional<Seller> getSellerById(Long id) {
        return sellerRepository.findById(id);
    }

    @Override
    public Seller getSellerByName(String name) {
        return sellerRepository.findByName(name);
    }

    @Override
    public Seller addSeller(Seller seller) {
        seller.setCreatedDate(LocalDateTime.now());
        return sellerRepository.save(seller);
    }

    @Override
    public Seller updateSeller(Seller seller) {
        seller.setUpdatedDate(LocalDateTime.now());
        return sellerRepository.save(seller);
    }

    @Override
    public Seller deleteSellerById(Long id) {
        Optional<Seller> seller = sellerRepository.findById(id);
        Seller sellerResponse=null;
        if(seller.isPresent()) {
            seller.get().setActive(false);
            sellerResponse = sellerRepository.save(seller.get());
        }
        return sellerResponse;
    }
}
