package com.autumnxtruong.NikPik.dao;

import com.autumnxtruong.NikPik.models.User;
import com.autumnxtruong.NikPik.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface iUser extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}