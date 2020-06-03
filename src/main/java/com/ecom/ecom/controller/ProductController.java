package com.ecom.ecom.controller;

import com.ecom.ecom.entity.Products;
import com.ecom.ecom.service.ProductsService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/products-module")
@ApiOperation("CRUD Operation of Products Module")
@Slf4j
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/products/{skuId}")
    public ResponseEntity<Products> getProductBySkuId(@NotNull @NotBlank @PathVariable("skuId") String skuId){
        Products products = productsService.findProductsBySku(skuId);
        if(products!=null){
            return new ResponseEntity<Products>(products, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<Products>(products, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/products/groupby/{groupName}")
    public ResponseEntity<List<String>> getProductGroupBy(@NotNull @NotBlank @PathVariable("groupName") String groupName){
        List<String> products = productsService.findProductGroupBy(groupName);
        if(products!=null){
            return new ResponseEntity<List<String>>(products, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<List<String>>(products, HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("/products/count/{sellerId}")
    public ResponseEntity<Long> countProductBySeller(@NotNull @PathVariable("sellerId") int sellerId){
        Long data = productsService.countProductsBySeller(sellerId);
        if(data!=0){
            return new ResponseEntity<Long>(data, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<Long>(data, HttpStatus.NOT_FOUND);
        }
    }

}
