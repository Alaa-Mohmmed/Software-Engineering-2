package com.app1.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app1.Entities.BrandEntity;

@Repository

public interface brandRepository  extends CrudRepository<BrandEntity, Integer>{

}
