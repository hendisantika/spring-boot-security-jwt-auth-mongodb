package id.my.hendisantika.springbootsecurityjwtauthmongodb.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 07:03
 * To change this template use File | Settings | File Templates.
 */
@Component
@Slf4j
public class JwtUtils {

    @Value("${hendi.app.jwtSecret}")
    private String jwtSecret;

    @Value("${hendi.app.jwtExpirationMs}")
    private int jwtExpirationMs;
}
