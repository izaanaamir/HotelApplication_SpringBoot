package com.example.lmdemo.seeder;

import com.example.lmdemo.model.User;
import com.example.lmdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseUserSeeder implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public DatabaseUserSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("izaan", "izaan123", "ADMIN"));
        users.add(new User("ahmed", "ahmed123", "USER"));
        users.add(new User("khan", "khan123", "USER"));
        users.add(new User("Jamal", "jamal123", "USER"));

        userRepository.saveAll(users);
    }
}