package com.MA.AlrightBet.Security;


import com.MA.AlrightBet.Dao.AdminDao;
import com.MA.AlrightBet.Dao.UserDao;
import com.MA.AlrightBet.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;

//REDIRECT URL --> localhost:8080/login/oauth2/code/google
@Configuration
public class SecurityConfig {


    @Autowired
    UserDao userDao;

    @Autowired
    AdminDao adminDao;


    // DEFINE WHICH ENDPOINTS REQUIRE AUTH
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login()
                .successHandler(
                        //SUCCESSFUL LOGIN
                        (request, response, obj) -> {
                            OAuth2User user_auth_details = (OAuth2User) obj.getPrincipal();

                            //CHECK IF EMAIL ALREADY IN DATABASE
                            if (userDao.findByEmail(user_auth_details.getAttribute("email")).isEmpty()) {
                                User user = new User(user_auth_details.getAttribute("email"), user_auth_details.getAttribute("iss").toString(), user_auth_details.getName());
                                user.setAdmin_role(adminDao.findByEmail(user.getEmail()).isPresent());
                                userDao.save(user);
                            }

                            //REDIRECT TO USER PROFILE PAGE
                            response.sendRedirect("/api/v1/admin");
                        }
                )
                .failureHandler(
                        //FAILURE LOGIN
                        (request, response, e) -> {
                            System.out.println(e.getMessage());
                            response.sendRedirect("/");
                        }
                )
        ;
        return http.build();
    }


}

