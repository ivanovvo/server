package vadim.help.neuro.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import vadim.help.neuro.jpa.models.Account;
import vadim.help.neuro.jpa.repository.AccountRepository;

@Configuration
@EnableGlobalAuthentication
public class ResourceSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    AccountRepository accountRepository;


    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        System.out.println("nvcsgfwevegv");
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*");
        configuration.addAllowedMethod("*");
        configuration.addAllowedHeader("*");
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("vfsdgbvdsghedbhedh");
        http.cors(Customizer.withDefaults()).authorizeRequests()
                .antMatchers("/user/register").permitAll()
                .antMatchers("/user/**").authenticated()
                .antMatchers("/animal/**").permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();

    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        System.out.println(auth + "logineeeeeeeeeeeeeee");
        auth.userDetailsService(userName -> {
            if (accountRepository.findAccountByLogin(userName).isPresent()) { /////////////////////////
                Account user = accountRepository.findAccountByLogin(userName).get(); /////////////////////////
                System.out.println(user);
                return new org.springframework.security.core.userdetails.User(
                        user.getLogin(),
                        "{noop}" + user.getPassword(), true, true, true, true,
                        AuthorityUtils.createAuthorityList("USER"));
            }
            return null;
        });
    }


}
