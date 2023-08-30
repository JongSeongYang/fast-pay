package com.example.membership.application.port.in;

import com.example.membership.domain.Membership;
import common.UseCase;

/*
밖에서 안으로 들어오는 요청에 의해 Membership을 등록하는 것
어떻게 실제 로직에서 동작할지 정의하는 부분
실제 구현한 로직은 Service 에서 처리
 */
@UseCase
public interface RegisterMembershipUseCase {
    Membership registerMembership(RegisterMembershipCommand command);
    void registerAxonMembership(RegisterMembershipCommand command);
}
