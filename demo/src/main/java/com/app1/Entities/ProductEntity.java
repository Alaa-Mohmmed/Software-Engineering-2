package com.app1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	   int ProductID;
    String Name;
    int price;
    String Category;
    int quantity;
    String store_name;
    boolean add_by_owner;
    int num_of_view;
    int num_of_buy;
    

    public ProductEntity(Integer id, int ProductID, String Name, int price, String Category,int quantity,String store_name,boolean add_by_owner,int num_of_view,int num_of_buy) {
        this.id = id;
        this.ProductID = ProductID;
        this.Name = Name;
        this.price = price;
        this.Category = Category;
        this .quantity= quantity;
        this .store_name=store_name;
        this.add_by_owner=add_by_owner;
        this. num_of_view=num_of_view;
        this.num_of_buy=num_of_buy;
    }

     public ProductEntity() {
        id=null;
        ProductID=0;
        Name=null;
        price=0;
        Category=null;
        quantity=0;
        store_name=null;
        add_by_owner=false;
        num_of_view=0;
        num_of_buy=0;
        
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public int getNum_of_buy() {
        return num_of_buy;
    }

    public void setNum_of_buy(int num_of_buy) {
        this.num_of_buy = num_of_buy;
    }

   

    public int getNum_of_view() {
        return num_of_view;
    }

    public void setNum_of_view(int num_of_view) {
        this.num_of_view = num_of_view;
    }

    public boolean getAdd_by_owner() {
        return add_by_owner;
    }

    public void setAdd_by_owner(boolean add_by_owner) {
        this.add_by_owner = add_by_owner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
   
   
}

   