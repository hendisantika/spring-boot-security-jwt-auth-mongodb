package id.my.hendisantika.springbootsecurityjwtauthmongodb.payload.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 07:07
 * To change this template use File | Settings | File Templates.
 */
@Data
public class LoginRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
