package com.example.membership.application.port.in;

import common.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;

/*
SelfValidating 추상함수를 구현하는 클래스의 Member들을 SelfValidating하기 위해서
 */
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterMembershipCommand extends SelfValidating<RegisterMembershipCommand> {
    @NotNull
    private final String name;

    @NotNull
    private final String email;

    @NotNull
    private final String address;

    @NotNull
    private final boolean isValid;

    public RegisterMembershipCommand(String name, String email, String address, boolean isValid) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;

        this.validateSelf();
    }
}
