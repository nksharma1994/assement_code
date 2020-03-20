package com.ecom.ecom.service;

import com.ecom.ecom.entity.Seller;

import java.util.List;
import java.util.Optional;

public interface SellerService {

    public List<Seller> getAllSeller();
    public Optional<Seller> getSellerById(Long id);
    public Seller getSellerByName(String name);
    public Seller addSeller(Seller seller);
    public Seller updateSeller(Seller seller);
    public Seller deleteSellerById(Long id);
}
