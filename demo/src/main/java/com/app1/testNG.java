package com.app1;
import com.app1.Repositories.brandRepository;
import com.app1.Repositories.productrep;

import static org.junit.Assert.*;
import com.app1.Controller.UserController;
import com.app1.Entities.BrandEntity;
import com.app1.Entities.ProductEntity;
import com.app1.Entities.UserEntity;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.app1.Repositories.userrep;
import com.app1.Controller.*;
public class testNG {
	@Mock
    private userrep reprository;
	private productrep repo;
    private brandRepository repBrand;

@InjectMocks
    private  UserController service;
private  ProductController service2;
private  BrandController service3;
/*@BeforeTest
public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
}*/
@Mock
private Model model;
ArrayList<UserEntity>users= new ArrayList<UserEntity>();
ArrayList<ProductEntity>products= new ArrayList<ProductEntity>();
ArrayList<BrandEntity>Brands= new ArrayList<BrandEntity>();

	@Test
	public void registerSuccess()
	{UserEntity e=new UserEntity();
		
		
		UserController c= new UserController();
		e=new UserEntity(12, 12, "bella","123d", "storeowner","bella");
		ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		users.add(new UserEntity(12, 12, "bella"," 1234", "admin","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.registerr(model,e),"register");
	}
	@Test
	public void registernpPass()
	{UserEntity e=new UserEntity();
		
		
		UserController c= new UserController();
		e=new UserEntity(12, 12, "bella","", "storeowner","bella");
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, "bella"," 1234", "admin","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.registerr(model,e),"register");
	}
	@Test
	public void registerNoUsername()
	{
		UserEntity e=new UserEntity();
		
		e=new UserEntity(12, 12, "","123d", "admin","bella");
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, ""," 1234", "storeowner","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.registerr(model,e),"register");
	}
	@Test
	public void loginSuccess()
	{UserEntity e=new UserEntity();
		
		
		UserController c= new UserController();
		e=new UserEntity(12, 12, "","123d", "storeowner","bella");
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, "bella","1", "admin","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.loginn(model,e),"success");
	}
	
	@Test
	public void loginNoname()
	{UserEntity e=new UserEntity();
		
		
		UserController c= new UserController();
		e=new UserEntity(2, 2, "","123", "storeowner","");
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, "bella","1", "admin","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.loginn(model,e),"success");
	}
	@Test
	public void loginWrongPass()
	{UserEntity e=new UserEntity();
		
		
		UserController c= new UserController();
		e=new UserEntity(1, 1, "rawan","5", "admin","");
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, "bella","1", "admin","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.loginn(model,e),"success");
	}
	@Test
	public void addProductSuccess()
	{
		ProductEntity e=new ProductEntity();
		
		e=new ProductEntity(15, 15, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		products.add(new ProductEntity(15, 15, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"addproduct");
	}
	@Test
	public void addProductWrongStore()
	{
		ProductEntity e=new ProductEntity();
		
		e=new ProductEntity(15, 15, "lipstick", 200, "makeup",10,"wrong store",true,3,4);
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"addproduct");
	}
	@Test
	public void addProductWithNoId()
	{
		ProductEntity e=new ProductEntity();
		e=new ProductEntity(15, 0, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"addproduct");
	}
	@Test
	public void getInfoProduct()
	{
		ProductEntity e=new ProductEntity();
		//e=new ProductEntity();
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"productinfo");
	}
	@Test
	public void showStatisticsSuccess()
	{
		ProductEntity e=new ProductEntity();
		//e=new ProductEntity();
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"newstatistic");
	}
	@Test
	public void showMax()
	{
		ProductEntity e=new ProductEntity();
		//e=new ProductEntity();
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"maxproduct");
	}
	@Test
	public void showMin()
	{
		ProductEntity e=new ProductEntity();
	//	e=new ProductEntity();
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"minproduct");
	}
	@Test
	public void showSumUsers()
	{
		UserEntity e=new UserEntity();
		
		//e=new UserEntity();
		//ArrayList<UserEntity>users= new ArrayList<UserEntity>();
		//users.add(new UserEntity(12, 12, ""," 1234", "storeowner","bella"));
		Mockito.when(reprository.findAll()).thenReturn(users);
		assertEquals(service.registerr(model,e),"sumofusers");
	}
	@Test
	public void showSumProducts()
	{

		ProductEntity e=new ProductEntity();
		//e=new ProductEntity();
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.addproduct(model,e),"sumofproducts");
	}
	@Test
	public void editProduct()
	{

		ProductEntity e=new ProductEntity();
		e=new ProductEntity(14, 10, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.edit(model,e),"edit_product");
	}
	@Test
	public void editProductwithwrongid()
	{

		ProductEntity e=new ProductEntity(14, 200, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		//e=new ProductEntity();
		products.add(new ProductEntity(14, 200, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.edit(model,e),"edit_product");
	}
	@Test
	public void deleteProduct()
	{

		ProductEntity e=new ProductEntity(14, 10, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		//e=new ProductEntity();
		products.add(new ProductEntity(14, 200, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.delete(model,e),"delete_product");
	}
	@Test
	public void deleteProductWrongID()
	{

		ProductEntity e=new ProductEntity(14, 200, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4);
		//e=new ProductEntity();
		products.add(new ProductEntity(14, 200, "lipstick", 200, "makeup",10,"rawan makeup store",true,3,4));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.delete(model,e),"delete_product");
	}
	@Test
	public void buyproduct()
	{
		
		ProductEntity e=new ProductEntity(4, 1, "shirt", 150, "clothes",1,"zara",true,1,1);
		//e=new ProductEntity();
		products.add(new ProductEntity(4, 1, "shirt", 150, "clothes",1,"zara",true,1,1));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.buy(model,e),"buy_product");
	}
	@Test
	public void buyproductwithnoname()
	{
		
		ProductEntity e=new ProductEntity(4, 1, "", 150, "clothes",1,"zara",true,1,1);
		//e=new ProductEntity();
		products.add(new ProductEntity(4, 1, "", 150, "clothes",1,"zara",true,1,1));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.buy(model,e),"buy_product");
	}
	@Test
	public void buyproductwithnoqty()
	{
		
		ProductEntity e=new ProductEntity(4, 1, "shirt", 150, "clothes",0,"zara",true,1,1);
		//e=new ProductEntity();
		products.add(new ProductEntity(4, 1, "shirt", 150, "clothes",0,"zara",true,1,1));
		Mockito.when(repo.findAll()).thenReturn(products);
		assertEquals(service2.buy(model,e),"buy_product");
	}
	@Test
	public void addbrand()
	{
		
	BrandEntity e=new BrandEntity(8, "brand8", "clothes");
		
		Brands.add(new BrandEntity(8, "brand8", "clothes"));
		Mockito.when(repBrand.findAll()).thenReturn(Brands);
		assertEquals(service3.addbrand(model,e),"addbrand");
	}
	@Test
	public void addbrandNoName()
	{
		
	BrandEntity e=new BrandEntity(8, "", "clothes");
		
		Brands.add(new BrandEntity(8, "brand8", "clothes"));
		Mockito.when(repBrand.findAll()).thenReturn(Brands);
		assertEquals(service3.addbrand(model,e),"addbrand");
	}
	@Test
	public void addBrandNoCategory()
	{
		
	BrandEntity e=new BrandEntity(8, "brand8", "");
		
		Brands.add(new BrandEntity(8, "brand8", "clothes"));
		Mockito.when(repBrand.findAll()).thenReturn(Brands);
		assertEquals(service3.addbrand(model,e),"addbrand");
	}
}
