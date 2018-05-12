package com.app1.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app1.Entities.StoreEntity;
import com.app1.Entities.UserEntity;
import com.app1.Repositories.storeRepository;



@Controller
public class StoreController {
	 @Autowired
	    private storeRepository rep3;
	       ////////////////////////////////////////////////////////////////////
	 
	 @GetMapping("/addstore")
	 public String addstore(Model model){
	        model.addAttribute("store",new StoreEntity());
	        return "addstore";
	    }
	    @PostMapping("/addstore")
	    public String addstore(Model model ,@ModelAttribute StoreEntity store){
	      // System.out.println(product.getName());
	       //System.out.println(product.getProductID());
	       rep3.save(store);
	        model.addAttribute("store",new StoreEntity());

	        return "addstore";
	    }
	    //////////////////////////////////////////////////////////////////////
	    
	    
	     @GetMapping("/confirmation")
	    public String confirmation(Model model){
	        model.addAttribute("store",new StoreEntity());
	         Iterable <StoreEntity  > storeit =rep3.findAll();
	        ArrayList <StoreEntity> store2=new ArrayList<StoreEntity>();
	    
	        for(StoreEntity store1:storeit){
	            store2.add(store1);
	          }
	        model.addAttribute("stores", store2);
	        
	        return"confirmation";
	    }
	    
	    
	    
	    @PostMapping("/confirmation")
	    public String confirmation(Model model ,@ModelAttribute StoreEntity store){
	        Iterable <StoreEntity  > storeit =rep3.findAll();
	        ArrayList <StoreEntity> store2=new ArrayList<StoreEntity>();
	    
	        for(StoreEntity store1:storeit){
	            store2.add(store1);
	          }
	        model.addAttribute("stores", store2);
	        for(int i=0;i<store2.size();i++){
	            if((store2.get(i).getStore_id()==store.getStore_id())){
	                 store2.get(i).setChecked_by_admin(true);
	                  rep3.save(store2.get(i));
	                return "confirmation";
	                
	            }
	        }
	        return "confirmation";
	              
	        
	    }
/////////////////////////////////////////////////////////////////////////////////////////////
	    
	    @GetMapping("/check")
	    public String check(Model model){
	        model.addAttribute("store",new StoreEntity());
	    return"check";
	    }
	  /////////////////////////////////////////  //////////////////////////////////////////////////////////////////////////////
	    @PostMapping("/check")
	    public String check(Model model ,@ModelAttribute StoreEntity store){
	        Iterable <StoreEntity  > storeit =rep3.findAll();
	        ArrayList <StoreEntity> store2=new ArrayList<StoreEntity>();
	        
	        for(StoreEntity store1:storeit){
	        	store2.add(store1);
	          }
	   
	        for(int i=0;i<store2.size();i++){
	            if(store2.get(i).getStore_name().equals(store.getStore_name())
	            &&(store2.get(i).getStore_id()==store.getStore_id())
	            
	            		){
	                
	                return "successowner";
	                
	            }
	        }
	        return "failed";
	}
	   
}
