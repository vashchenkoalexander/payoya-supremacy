package payoya.com.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/post/*")
//                .permitAll()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/posts")
//                .authenticated()
//                .and().formLogin().and()

//                .authorizeHttpRequests()
//                .requestMatchers("/*")
//                .permitAll()
//                .and()
                .authorizeHttpRequests()
                .requestMatchers("/**")
                .permitAll()
                .and()

                .build();
    }

    // TODO create a log in based on pass and login of User Entity
}
