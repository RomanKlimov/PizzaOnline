package ru.itis.pizzaonline.security.webConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@ComponentScan("ru.itis.pizzaonline")
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthenticationProvider authenticationProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/home").permitAll()
                .antMatchers("/user").permitAll()
                .antMatchers("/order").permitAll()
                .antMatchers("/confirmRegistration").permitAll()
                .antMatchers("/admin/**").hasAuthority("ADMIN")
                .antMatchers("/user/**").hasAuthority("CLIENT")
                .antMatchers("/css/**").permitAll()
                .antMatchers("/scss/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/plugins/**").permitAll()
                .antMatchers("/pic/**").permitAll()
                .antMatchers("/courier/**").permitAll()
                .antMatchers("/signUp").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/").permitAll()
                .antMatchers("/toCart").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login")
                .usernameParameter("login")
                .passwordParameter("password")
                .defaultSuccessUrl("/")
                .failureUrl("/login?error")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("logout")
                .logoutSuccessUrl("/login")
                .permitAll();

        http.csrf().disable();
    }

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider);
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
