package ru.company.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/public/users")
@Slf4j
public class UserController {

    @PostMapping
    public void create() {
        log.info("create user");
    }

    @GetMapping
    public void read() {
        log.info("read user");
    }

    @PatchMapping
    public void update() {
        log.info("update user");
    }

    @DeleteMapping
    public void delete(){
        log.info("delete user");
    }


}
