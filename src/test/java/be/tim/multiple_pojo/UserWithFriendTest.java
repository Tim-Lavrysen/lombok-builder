package be.tim.multiple_pojo;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserWithFriendTest {

    private static final String OVERRIDE_DEFAULT_EMAIL_BUILDER_VALUE = "override-default-value";
    private static final String OVERRIDE_DEFAULT_FRIENDNAME_BUILDER_VALUE = "I think it was Wally";

    @Test
    public void createUserWithAFriendLombokBuilder() {
        UserWithAFriend user = UserWithAFriendBuilder.aUserWithAFriend()
                .email(OVERRIDE_DEFAULT_EMAIL_BUILDER_VALUE)
                .build();

        assertThat(user.getFirstname()).isEqualTo("default first name");
        assertThat(user.getLastname()).isEqualTo("default last name");
        assertThat(user.getEmail()).isEqualTo(OVERRIDE_DEFAULT_EMAIL_BUILDER_VALUE);
    }

    @Test
    public void createUserWithAFriendLombokBuilderAndOverrideAFriendValue() {
        FriendBuilder friend = FriendBuilder.aFriend()
                .whatWasHisNameAgain(OVERRIDE_DEFAULT_FRIENDNAME_BUILDER_VALUE)
                .build();

        UserWithAFriend user = UserWithAFriendBuilder.aUserWithAFriend()
                .friend(friend)
                .build();

        assertThat(user.getFriend().getWhatWasHisNameAgain()).isEqualTo(OVERRIDE_DEFAULT_FRIENDNAME_BUILDER_VALUE);
    }
}
