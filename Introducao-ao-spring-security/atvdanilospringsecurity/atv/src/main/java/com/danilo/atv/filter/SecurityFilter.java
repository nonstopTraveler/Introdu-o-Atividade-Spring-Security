package com.danilo.atv.filter;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

@Controller
// Indica que a classe pode atuar como controlador do Spring.

@EnableWebSecurity
// Habilita a configuração de segurança do Spring Security.
public class SecurityFilter {

    @Bean
    // Registra o metodo como um componente gerenciado pelo Spring.
    public SecurityFilterChain securityFilterChain(HttpSecurity htpp){
        return htpp.csrf( csrf -> csrf.disable())
                .sessionManagement( session-> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.GET, "/produtos").permitAll())
                .authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST,"/produtos").permitAll())
                .build();
    }
}
