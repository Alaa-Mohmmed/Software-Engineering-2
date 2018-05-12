 package com.app1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrandEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer id;
    private String brand_name;
    private String brand_category;
    

    public BrandEntity(Integer id, String brand_name, String brand_category) {
        this.id = id;
        this.brand_name = brand_name;
        this.brand_category = brand_category;
    }
    public BrandEntity(){
        id=0;
        brand_name=null;
        brand_category=null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getBrand_category() {
        return brand_category;
    }

    public void setBrand_category(String brand_category) {
        this.brand_category = brand_category;
    }
   

}
