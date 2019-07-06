package com.escalade.svc.implementation;

import com.escalade.data.model.UserEscalad;
import com.escalade.data.repository.UserEscaladRepository;
import com.escalade.svc.contracts.UserEscaladService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserEscaladServiceImpl implements UserEscaladService {


    @Autowired
    private UserEscaladRepository repo;

    @Override
    public UserEscalad getUserEscaladByUserName(String userName) {
        return repo.findByUserName(userName);
    }

    @Override
    public void createUser(UserEscalad userEscalad) {
        repo.save(userEscalad);
    }

    @Override
    public UserEscalad getUser(String username) {
        return repo.findByUserName(username);
    }

    /*@Override
    public List<UserEscalad> listUser() {
        return null;
    }*/

    @Override
    public UserEscalad findByUserEscaladId(int userEscaladId) {
        return repo.findByUserEscaladId(userEscaladId);
    }


}
