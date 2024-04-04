package id.my.hendisantika.springbootsecurityjwtauthmongodb;

import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.ERole;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.Role;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringBootSecurityJwtAuthMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityJwtAuthMongodbApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(RoleRepository roleRepository) {
        roleRepository.deleteAll();
        return (args ->
                roleRepository.saveAll(
                        List.of(new Role(ERole.ROLE_USER),
                                new Role(ERole.ROLE_ADMIN), new Role(ERole.ROLE_MODERATOR))
                ));
    }

}
