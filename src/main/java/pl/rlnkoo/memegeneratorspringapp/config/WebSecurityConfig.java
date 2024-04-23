package pl.rlnkoo.memegeneratorspringapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

                http
				.authorizeHttpRequests((authorize) -> authorize
                .anyRequest().permitAll()
        )
                .httpBasic(withDefaults())
                .formLogin(withDefaults());

        return http.build();
    }
}
