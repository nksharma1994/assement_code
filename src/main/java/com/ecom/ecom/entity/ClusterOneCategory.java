package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clstone_tab_Category")
@Getter
@Setter
public class ClusterOneCategory extends Category{

    public ClusterOneCategory(){
        super();
    }
}
