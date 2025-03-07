package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http

                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/signup", "/h2-console/**", "/static/**").permitAll() // Allowed URLs
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable()) // CSRF pura delete 🔥
                .headers(headers -> headers
                        .frameOptions(frame -> frame.sameOrigin()) // Ye line replace ho gayi
                )
                .formLogin(login -> login
                        .loginPage("/login") // Custom Login Page
                        .permitAll()
                        .defaultSuccessUrl("/home", true) // Login ke baad kaha jaayega
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login")
                        .permitAll());


        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();



    }

}
