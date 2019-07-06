package com.escalade.svc.contracts;

import com.escalade.data.model.UserEscalad;

import java.util.List;

public interface UserEscaladService {

    UserEscalad getUserEscaladByUserName(String username);
    void createUser(UserEscalad user);
    UserEscalad getUser(String username);
    UserEscalad findByUserEscaladId(int userEscaladId);


}
