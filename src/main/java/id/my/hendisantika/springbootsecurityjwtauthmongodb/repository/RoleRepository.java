package id.my.hendisantika.springbootsecurityjwtauthmongodb.repository;

import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.ERole;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 06:55
 * To change this template use File | Settings | File Templates.
 */
public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
