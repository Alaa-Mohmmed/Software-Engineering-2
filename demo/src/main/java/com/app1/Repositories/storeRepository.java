package com.app1.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.app1.Entities.StoreEntity;

public interface storeRepository  extends CrudRepository<StoreEntity, Integer>  {

}
