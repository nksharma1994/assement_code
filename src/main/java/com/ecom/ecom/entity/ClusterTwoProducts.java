package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clsttwo_tab_products")
@Getter
@Setter
public class ClusterTwoProducts extends Products{

    public ClusterTwoProducts(){
        super();
    }


}
