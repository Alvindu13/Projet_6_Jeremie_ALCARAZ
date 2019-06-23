package com.escalade.data.repository;

import com.escalade.data.model.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole, Integer>{

    //UserRole saveUser(UserRole userRole);

}
