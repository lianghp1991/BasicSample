package com.lhp.copy.basicsample.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.lhp.copy.basicsample.model.Product;

/**
 * @author lianghp
 * @Date 2018/10/23
 **/
@Entity(tableName = "products")
public class ProductEntity implements Product {
    @PrimaryKey
    private int id;
    private String name;
    private String description;
    private int price;

    @Override
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductEntity(){}
    public ProductEntity(int id, String name, String description, int price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public ProductEntity(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }
}
