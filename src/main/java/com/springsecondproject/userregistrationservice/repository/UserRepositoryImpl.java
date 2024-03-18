package com.springsecondproject.userregistrationservice.repository;

import com.springsecondproject.userregistrationservice.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositoryImpl extends CrudRepository<UserEntity, Integer> {
}
