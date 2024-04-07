package org.example.demobasicauthpp.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.demobasicauthpp.model.AppUser;
import org.example.demobasicauthpp.model.AppUserRequest;
import org.springframework.security.core.userdetails.UserDetails;

@Mapper
public interface AppUserRepository {

    @Select("""
            INSERT INTO users (name, password, email, role)
            VALUES (#{user.name}, #{user.password}, #{user.email}, #{user.role})
            RETURNING *
            """)
    AppUser saveUser(@Param("user") AppUserRequest appUserRequest);

    @Select("""
            SELECT * FROM users WHERE email = #{email}
            """)
    AppUser findByEmail(String email);
}
