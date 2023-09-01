package com.example.membership.application.service;

import com.example.membership.application.port.in.RegisterMembershipCommand;
import com.example.membership.application.port.in.RegisterMembershipUseCase;
import com.example.membership.domain.Membership;
/*
DB와의 통신은 외부로 나가는 것이므로 port, adapter로 구현해야함
 */
public class RegisterMembershipService implements RegisterMembershipUseCase {
    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        // command -> DB

        //
    }

    @Override
    public void registerAxonMembership(RegisterMembershipCommand command) {

    }
}
