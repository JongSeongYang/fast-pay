package com.example.membership.adapter.out.persistence;

import com.example.membership.application.port.out.RegisterMembershipPort;
import com.example.membership.domain.Membership;
import common.PersistenceAdapter;

@PersistenceAdapter
public class MembershipPersistenceAdapter implements RegisterMembershipPort {
    @Override
    public void createMembership(Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid, Membership.MembershipIsCorp membershipIsCorp, Membership.MembershipAggregateIdentifier membershipAggregateIdentifier) {

    }
}
