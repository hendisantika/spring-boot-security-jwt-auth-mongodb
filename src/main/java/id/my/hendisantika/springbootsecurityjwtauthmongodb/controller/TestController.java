package id.my.hendisantika.springbootsecurityjwtauthmongodb.controller;

import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.Role;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.model.User;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.repository.RoleRepository;
import id.my.hendisantika.springbootsecurityjwtauthmongodb.repository.UserRepository;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-jwt-auth-mongodb
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/2/24
 * Time: 07:10
 * To change this template use File | Settings | File Templates.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/roles")
    public List<Role> allRoles() {
        return roleRepository.findAll();
    }

    @GetMapping("/user")
    @SecurityRequirement(name = "Authorization")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess() {
        return "User Content.";
    }

    @GetMapping("/mod")
    @SecurityRequirement(name = "Authorization")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess() {
        return "Moderator Board.";
    }

    @GetMapping("/admin")
    @SecurityRequirement(name = "Authorization")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
