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

                .authorizeHttpRequests()
                .requestMatchers("/*")
                .permitAll()
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/**")
                .permitAll()
                .and()


//                .authorizeHttpRequests()
//                .requestMatchers("/**")// in new version instead of method antMatchers you must use .requestMatchers
//                .authenticated()
//                .and().formLogin()
//                .and()

//                .authorizeHttpRequests()
//                .and()
//                .formLogin()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers( "/tpps/v1/userwithpass/**" , "/tpps/v1/typeofcredit/**", "/tpps/v1/user/**") // in new version instead of method antMatchers you must use .requestMatchers
//                .permitAll()
//                .and()
//                .authorizeHttpRequests()
//                .requestMatchers("/tpps/v1/user/**")// in new version instead of method antMatchers you must use .requestMatchers
//                .authenticated()
//                .and().formLogin()
//                .and()
                .build();
    }
}
