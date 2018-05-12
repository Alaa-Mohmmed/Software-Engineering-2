package com.app1.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

    private int UserID;
    private String name;
    private String pass;
    private String user_type;
    private String store_name;
 public UserEntity(Integer id, int UserID, String name, String pass, String user_type,String store_name) {
        this.id = id;
        this.UserID = UserID;
        this.name = name;
        this.pass = pass;
        this.user_type = user_type;
        this.store_name= store_name;
    }

    public UserEntity() {
        id=null;
        UserID=0;
        name=null;
        pass=null;
        user_type=null;
         store_name=null;
    }
    public Integer getId() {
        return id;
    }

   

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }
    public String getstoreName() {
        return store_name;
    }

    public void setstoreName(String store_name) {
        this.store_name = store_name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    

}


