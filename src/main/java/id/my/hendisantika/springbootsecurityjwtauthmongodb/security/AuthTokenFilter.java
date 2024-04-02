package id.my.hendisantika.springbootsecurityjwtauthmongodb.security;

import id.my.hendisantika.springbootsecurityjwtauthmongodb.service.UserDetailsServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 07:02
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
public class AuthTokenFilter extends OncePerRequestFilter {
    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

}
