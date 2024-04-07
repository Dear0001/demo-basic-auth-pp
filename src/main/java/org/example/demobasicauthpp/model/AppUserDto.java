package org.example.demobasicauthpp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUserDto {
    private Integer id;
    private String name;
    private String email;
    private String role;
}
