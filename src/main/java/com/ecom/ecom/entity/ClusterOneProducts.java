package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clstone_tab_products")
@Getter
@Setter
public class ClusterOneProducts extends Products{

    public ClusterOneProducts(){
        super();
    }
}
