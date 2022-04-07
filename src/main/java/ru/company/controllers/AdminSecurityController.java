package ru.company.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

@RestController
@RequestMapping("/api/v1/security/admins")
@Slf4j
public class AdminSecurityController {

    @GetMapping
    public String securityGreeting() {
        log.info("security greeting for admin");
        return "hello admin!";
    }

}
