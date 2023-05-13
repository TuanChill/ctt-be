package com.ctt.cttbe.Service.UserAuth;

import com.ctt.cttbe.Entity.UserAuth.UserAuth;
import com.ctt.cttbe.Repository.UserAuth.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthServiceImpl implements UserAuthService{

    @Autowired
    private UserJpaRepository userRepository;


    @Override
    public UserAuth registerUser(UserAuth userModel) {
        return null;
    }

    @Override
    public UserAuth loginUser(UserAuth userModel) {
        return null;
    }
}
