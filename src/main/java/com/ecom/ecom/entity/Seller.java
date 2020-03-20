package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_seller")
@Getter
@Setter
public class Seller {

    public Seller(){
        super();
    }@Id
    @GeneratedValue
    private Long id;

    @Version
    private int version;

    private LocalDateTime createdDate;

    private String createdBy;

    private LocalDateTime updatedDate;

    private String updatedBy;

    private boolean isActive;

    @Column(name = "seller_name", nullable = false)
    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = LocalDateTime.now();
    }

    public void setActive(boolean active) {
        isActive = true;
    }
}
