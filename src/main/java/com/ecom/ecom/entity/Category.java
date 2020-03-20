package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tab_category")
@Getter
@Setter
public class Category {

    public Category(){
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

    @Column(name = "category_name", nullable = false)
    private String name;


    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = LocalDateTime.now();
    }

    public void setActive(boolean active) {
        isActive = true;
    }
}
