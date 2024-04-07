package org.example.demobasicauthpp.service;


import org.example.demobasicauthpp.model.AppUser;
import org.example.demobasicauthpp.model.AppUserDto;
import org.example.demobasicauthpp.model.AppUserRequest;
import org.example.demobasicauthpp.repository.AppUserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {
    private ModelMapper mapper = new ModelMapper();

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;

    public AppUserServiceImpl(AppUserRepository appUserRepository, PasswordEncoder passwordEncoder) {
        this.appUserRepository = appUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findByEmail(email);
        return appUser;
    }

    @Override
    public AppUserDto createUser(AppUserRequest appUserRequest) {
//        String passwordEncode = ;
        appUserRequest.setPassword(passwordEncoder.encode(appUserRequest.getPassword()));
        AppUser appUser = appUserRepository.saveUser(appUserRequest);
        return mapper.map(appUser, AppUserDto.class);
    }
}
