package org.example.demobasicauthpp.service;

import org.example.demobasicauthpp.model.AppUserDto;
import org.example.demobasicauthpp.model.AppUserRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService extends UserDetailsService {

    AppUserDto createUser(AppUserRequest appUserRequest);
}
