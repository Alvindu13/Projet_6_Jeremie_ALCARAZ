package com.escalade.svc.implementation;

import com.escalade.data.model.UserRole;
import com.escalade.data.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userRoleService")
public class UserRoleServiceImpl {

    @Autowired
    private UserRoleRepository repo;

    public void saveUser(UserRole userRole){
        repo.save(userRole);
    }
}
