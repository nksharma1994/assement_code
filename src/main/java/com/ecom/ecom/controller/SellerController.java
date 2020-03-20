package com.ecom.ecom.controller;

import com.ecom.ecom.entity.Seller;
import com.ecom.ecom.service.SellerService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/seller-module")
@ApiOperation("CRUD Operation of Seller Module")
@Slf4j
public class SellerController {

    @Autowired
    private SellerService sellerService;

    public SellerController(){
        super();
    }

    @GetMapping("/sellers")
    public ResponseEntity<List<Seller>> getAllSeller(){
        List<Seller> sellers = sellerService.getAllSeller();
        if(!sellers.isEmpty()){
            return new ResponseEntity<List<Seller>>(sellers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<List<Seller>>(sellers, HttpStatus.NO_CONTENT);
        }
    }


}
