package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_product")
@Getter
@Setter
public class Products {

    public Products(){
        super();
    }

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private int version;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

    private boolean isActive;

    @Column(name = "sku_id", nullable = false)
    private String sku;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(nullable = false)
    private String size;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String brand;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = LocalDateTime.now();
    }

    public void setActive(boolean active) {
        isActive = true;
    }

}
