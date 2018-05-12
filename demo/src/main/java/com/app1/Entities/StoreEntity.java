package com.app1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StoreEntity {
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Integer id;
	    private Integer store_id;
	    private String store_name;
	    private String store_type;
	    private String store_location;
	    private Boolean checked_by_admin;

	    
	      public StoreEntity() {
	          id=0;
	          store_id=0;
	          store_name=null;
	          store_type=null;
	          store_location=null;
	          checked_by_admin=false;
	          
	    }
	    public StoreEntity(Integer id, Integer store_id, String store_name, String store_type, String store_location,Boolean checked_by_admin) {
	        this.id = id;
	        this.store_id = store_id;
	        this.store_name = store_name;
	        this.store_type = store_type;
	        this.store_location = store_location;
	        this.checked_by_admin=checked_by_admin;
	    }

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Boolean getChecked_by_admin() {
	        return checked_by_admin;
	    }

	    public void setChecked_by_admin(Boolean checked_by_admin) {
	        this.checked_by_admin = checked_by_admin;
	    }

	    public Integer getStore_id() {
	        return store_id;
	    }

	    public void setStore_id(Integer store_id) {
	        this.store_id = store_id;
	    }

	    public String getStore_name() {
	        return store_name;
	    }

	    public void setStore_name(String store_name) {
	        this.store_name = store_name;
	    }

	    public String getStore_type() {
	        return store_type;
	    }

	    public void setStore_type(String store_type) {
	        this.store_type = store_type;
	    }

	    public String getStore_location() {
	        return store_location;
	    }

	    public void setStore_location(String store_location) {
	        this.store_location = store_location;
	    }
	    
	    
	    


}
