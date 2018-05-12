package com.app1.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app1.Entities.BrandEntity;
import com.app1.Entities.ProductEntity;
import com.app1.Repositories.brandRepository;


@Controller
public class BrandController {
	
	  @Autowired
	    private brandRepository rep2;
	      
	    ///////////////////////////////////////////////////////////////////
	    
	  
	    @GetMapping("/addbrand")
	    public String addbrand(Model model){
	        model.addAttribute("brand",new BrandEntity());
	        return "addbrand";
	    }
	    @PostMapping("/addbrand")
	    public String addbrand(Model model ,@ModelAttribute BrandEntity brand){
	      // System.out.println(product.getName());
	       //System.out.println(product.getProductID());
	       rep2.save(brand);
	        model.addAttribute("brand",new BrandEntity());

	        return "addbrand";
	    }
	 
}
