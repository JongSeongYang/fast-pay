package com.example.membership.adapter.in.web;

import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController {

    @PostMapping(path = "/register")
    void registerMembership(){
        System.out.println("Hello world");
    }
}
