package org.example.demobasicauthpp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
//public class InMemorySecurityConfig {
//    private final PasswordEncoder passwordEncoder;
//
//    public InMemorySecurityConfig(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    //create user for authentication
//    @Bean
//    UserDetailsService userDetailsService(){
//        UserDetails user1 = User.builder()
//                .username("user")
//                .password(passwordEncoder.encode("1234"))
//                .roles("USER")
//                .build();
//        UserDetails user2 = User.builder()
//                .username("admin")
//                .password(passwordEncoder.encode("123"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
//
//
//    //authorization protect each endpoint
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
////                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(request -> request
//                        .requestMatchers("/test").permitAll()
//                        .requestMatchers("/user").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers("/admin").hasAnyRole("ADMIN")
//                        .anyRequest().authenticated()
//                ).formLogin(Customizer.withDefaults());
//        return httpSecurity.build();
//    }


//}
