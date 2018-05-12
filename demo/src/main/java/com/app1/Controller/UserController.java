package com.app1.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.app1.Entities.ProductEntity;
import com.app1.Entities.StoreEntity;
import com.app1.Entities.UserEntity;
import com.app1.Repositories.productrep;
import com.app1.Repositories.userrep;


@Controller
public class UserController {
	@Autowired
private userrep repo;
	@Autowired
	private productrep repo1;
	//register
	
	int count=0;
	@GetMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("user", new UserEntity());
		return "register";
	}
	@PostMapping("/register")
	public String registerr(Model model, @ModelAttribute UserEntity user)
	{
		
			System.out.println(user.getName());
	       System.out.println(user.getUser_type());
	       if(user.getName()==null)
	       {
	    	   return "failed";
	       }
	       if(user.getPass()==null)
	       {
	    	   return "failed";
	       }
		
		model.addAttribute("user", new UserEntity());
		repo.save(user);
		return "register";
	}
	
	
	@GetMapping("/login")
    public String loginn(Model model){
        model.addAttribute("user",new UserEntity());
    return"login";
    }
    @PostMapping("/login")
    public String loginn(Model model ,@ModelAttribute UserEntity user){
        Iterable <UserEntity  > userit =repo.findAll();
        ArrayList <UserEntity> user2=new ArrayList<UserEntity>();
    
        for(UserEntity user1:userit){
            user2.add(user1);
          }
   
        for(int i=0;i<user2.size();i++){
            if(user2.get(i).getName().equals(user.getName())
            &&(user2.get(i).getPass().equals(user.getPass()))
            &&(user2.get(i).getUser_type().equals(user.getUser_type()))
            &&(user.getUser_type().equals("admin"))
            		
            		
            		
            		){
                 //  System.out.println("success");
                return "success";
                
            }else if(user2.get(i).getName().equals(user.getName())
                    &&(user2.get(i).getPass().equals(user.getPass()))
                    &&(user2.get(i).getUser_type().equals(user.getUser_type()))
                    &&(user.getUser_type().equals("user"))
                    		
                    		
                    		
                    		){
                    
                    return "successu";
        
            }else if(user2.get(i).getName().equals(user.getName())
                    &&(user2.get(i).getPass().equals(user.getPass()))
                    &&(user2.get(i).getUser_type().equals(user.getUser_type()))
                    &&(user.getUser_type().equals("storeowner")
                    		)
                    		
                    		
                    		
                    		){
                
                return "successowner";
            
            }
        }
        return "failed";
              
        
    }  
   

    @GetMapping("/sumofusers")
    public String sum(Model model){
        //model.addAttribute("product",new Product());
        Iterable <UserEntity  > userit =repo.findAll();
        ArrayList <UserEntity> user2=new ArrayList<UserEntity>();
        int sum=0;
        for(UserEntity user1:userit){
            user2.add(user1);
          }
         for(int i=0;i<user2.size();i++){
            if(user2.get(i).getUser_type().equals("user")){
                
                sum++;
            }
        }
         
        model.addAttribute("sumofusers",sum);
        return"sumofusers";
    }
        
    @PostMapping("/sumofusers")
    public String sum(Model model ,@ModelAttribute UserEntity user){
        Iterable <UserEntity  > userit =repo.findAll();
        ArrayList <UserEntity> user2=new ArrayList<UserEntity>();
        int sum=0;
        for(UserEntity user1:userit){
            user2.add(user1);
          }
        for(int i=0;i<user2.size();i++){
            if(user2.get(i).getUser_type().equals("user")){
                sum++;
            }
        }
        model.addAttribute("sumofusers",sum);
        return"sumofusers";
           
            
            
        
        
    }  
    //////////////////////////////////////////////////////////////////////
    
    @GetMapping("/addcolla")
    public String addcolla(Model model){
        model.addAttribute("user",new UserEntity());
        return "addcolla";
    }
    @PostMapping("/addcolla")
    public String addcolla(Model model ,@ModelAttribute UserEntity user){
      // System.out.println(user.getName());
       //System.out.println(user.getUser_type());
       repo.save(user);
       model.addAttribute("user",new UserEntity());

        return "addcolla";
    }
    
    

}
