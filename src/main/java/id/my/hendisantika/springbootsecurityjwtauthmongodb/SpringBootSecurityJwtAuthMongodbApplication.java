package id.my.hendisantika.springbootsecurityjwtauthmongodb;

import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.ERole;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.Role;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringBootSecurityJwtAuthMongodbApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(SpringBootSecurityJwtAuthMongodbApplication.class, args);

        val env = app.getEnvironment();
        log.info(env.getProperty("spring.data.mongodb.uri"));
    }

    @Bean
    public CommandLineRunner initData(RoleRepository roleRepository) {
        roleRepository.deleteAll();
        return (args ->
                roleRepository.saveAll(
                        List.of(new Role(ERole.ROLE_USER),
                                new Role(ERole.ROLE_ADMIN),
                                new Role(ERole.ROLE_MODERATOR))
                ));
    }

}
