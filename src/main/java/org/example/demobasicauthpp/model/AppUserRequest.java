package org.example.demobasicauthpp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserRequest {
    private String name;
    private String email;
    private String password;
    private String role;
}