package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clstone_tab_seller")
@Getter
@Setter
public class ClusterOneSeller extends Seller{

    public ClusterOneSeller(){
        super();
    }

}
