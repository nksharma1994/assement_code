package com.ecom.ecom.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clsttwo_tab_category")
@Getter
@Setter
public class ClusterTwoCategory extends Category{

    public ClusterTwoCategory(){
        super();
    }
}
