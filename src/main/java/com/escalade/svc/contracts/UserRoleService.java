package com.escalade.svc.contracts;

import com.escalade.data.model.UserRole;
import org.springframework.data.jpa.repository.Query;

public interface UserRoleService {


    UserRole saveRoleUser(UserRole userRole);
}
