package id.my.hendisantika.springbootsecurityjwtauthmongodb.config;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 07:42
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@SecurityScheme(
        name = "Authorization",
        scheme = "bearer",
        type = SecuritySchemeType.APIKEY,
        in = SecuritySchemeIn.HEADER,
        bearerFormat = "JWT"
)
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info().title("Demo project for Spring Boot Auth with Spring Security, JWT and MongoDB")
                .description("Demo project for Spring Boot Auth with Spring Security, JWT and MongoDB")
                .version("v0.0.2")
                .contact(getContactDetails()));
    }

    private Contact getContactDetails() {
        return new Contact().name("Hendi Santika")
                .email("hendisantika@yahoo.co.id")
                .url("https://s.id/hendisantika");
    }

}
