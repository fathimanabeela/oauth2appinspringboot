package com.example.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    /**
     * security filter chain filters request.
     * @return secured string
     * @param http is http
     */
  @SuppressWarnings("checkstyle:FinalParameters")
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http)
          throws Exception {
      return http
              .oauth2Login(Customizer.withDefaults())
              .authorizeHttpRequests(authorize -> authorize
                      .requestMatchers("/").permitAll()
                      .anyRequest().authenticated()
              )

      .build();

  }
}
