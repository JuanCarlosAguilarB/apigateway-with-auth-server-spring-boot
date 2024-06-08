package com.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Deshabilitar CSRF para APIs REST
                .authorizeHttpRequests(authorizeRequests -> authorizeRequests
                        .requestMatchers("/user/v1/user/").permitAll()  // Permitir acceso a la ruta de registro
                        .anyRequest().authenticated()  // Requiere autenticación para cualquier otra solicitud
                )
                .httpBasic();

        return http.build();
    }
}