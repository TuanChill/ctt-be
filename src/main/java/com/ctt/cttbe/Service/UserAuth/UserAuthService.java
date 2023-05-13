package com.ctt.cttbe.Service.UserAuth;

import com.ctt.cttbe.Entity.UserAuth.UserAuth;

public interface UserAuthService {
    UserAuth registerUser(UserAuth theUser);
    UserAuth loginUser(UserAuth userModel);
}
