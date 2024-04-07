package org.example.demobasicauthpp.controller;

import org.example.demobasicauthpp.model.ApiResponse;
import org.example.demobasicauthpp.model.AppUserDto;
import org.example.demobasicauthpp.model.AppUserRequest;
import org.example.demobasicauthpp.service.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private final AppUserService appUserService;

    public AuthenticationController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUserRequest appUserRequest){
        AppUserDto appUserDto = appUserService.createUser(appUserRequest);

        return ResponseEntity.ok(
                ApiResponse.builder()
                        .message("User registered successfully")
                        .status(HttpStatus.CREATED)
                        .code(201)
                        .payload(appUserDto)
                        .build()
        );

    }
}
