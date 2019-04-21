package ua.net.azhytnytskyi.articlesserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import ua.net.azhytnytskyi.articlesserver.model.User;
import ua.net.azhytnytskyi.articlesserver.service.UserService;

@SpringBootApplication
public class ArticlesServerApplication implements ApplicationRunner {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ArticlesServerApplication.class, args);
    }

    @Bean
    public FilterRegistrationBean corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
        bean.setOrder(0);
        return bean;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setUserName("admin");
        user.setUserPassword("admin");
        userService.saveUser(user);
    }
}
