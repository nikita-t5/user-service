package ru.company.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for CRUD for users
 */
@RestController
@RequestMapping("/api/v1/security/users")
@Slf4j
public class UserSecurityController {

    @GetMapping
    public String securityGreeting() {
        log.info("security greeting for user");
        return "hello user!";
    }
}
