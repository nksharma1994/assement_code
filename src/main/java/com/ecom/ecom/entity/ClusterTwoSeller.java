package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clsttwo_tab_seller")
@Getter
@Setter
public class ClusterTwoSeller extends Seller{

    public ClusterTwoSeller(){
        super();
    }
}
