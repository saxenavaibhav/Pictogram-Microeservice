package com.saxena.vaibhav.pictogram.user.service.data;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

	UserEntity findByEmail(String email);
}
