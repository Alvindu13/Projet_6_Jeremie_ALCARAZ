package com.escalade.svc.implementation;

import com.escalade.data.model.UserEscaladRole;
import com.escalade.data.repository.UserEscaladRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userRoleService")
public class UserEscaladRoleServiceImpl {

    @Autowired
    private UserEscaladRoleRepository repo;

    public void saveUser(UserEscaladRole userEscaladRole){
        repo.save(userEscaladRole);
    }
}
