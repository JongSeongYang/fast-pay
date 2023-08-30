package com.example.membership.adapter.in.web;

import com.example.membership.application.port.in.RegisterMembershipCommand;
import com.example.membership.application.port.in.RegisterMembershipUseCase;
import common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
class RegisterMembershipController {

    private final RegisterMembershipUseCase registerMembershipUseCase;

    @PostMapping(path = "/membership/register/")
    void registerMembership(@RequestBody RegisterMembershipRequest request){
        // RegisterMembershipRequest
        // name, address, email

        // request -> command 로 중간에 추상화하여 처리
        // request 가 변경되어도 뒷 부분은 변경되면 안되기 때문에
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .build();
        registerMembershipUseCase.registerMembership(command);
    }


    @PostMapping(path = "/membership/axon-register/")
    void registerAxonMembership(@RequestBody RegisterMembershipRequest request){
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getEmail())
                .build();

        registerMembershipUseCase.registerAxonMembership(command);
    }
}
