package com.clothinventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.clothinventory.entity.User;
import com.clothinventory.entity.Role;
import com.clothinventory.repository.UserRepository;
import java.util.Set;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class ClothInventoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClothInventoryApplication.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner initUsers(@Autowired UserRepository userRepository, @Autowired PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.count() == 0) {
                User admin = new User("admin", passwordEncoder.encode("admin123"), Set.of(Role.ADMIN));
                User manager = new User("manager", passwordEncoder.encode("manager123"), Set.of(Role.STORE_MANAGER));
                userRepository.save(admin);
                userRepository.save(manager);
            }
        };
    }
}
