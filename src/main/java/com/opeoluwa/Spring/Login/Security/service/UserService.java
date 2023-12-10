package com.opeoluwa.Spring.Login.Security.service;

import com.opeoluwa.Spring.Login.Security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
}
