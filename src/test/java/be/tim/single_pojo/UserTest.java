package be.tim.single_pojo;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    private static final String OVERRIDE_DEFAULT_BUILDER_VALUE = "override-default-value";

    @Test
    public void createUserWithLombokBuilder() {
        User user = UserBuilder.aUser().email(OVERRIDE_DEFAULT_BUILDER_VALUE).build();

        assertThat(user.getFirstname()).isEqualTo("default first name");
        assertThat(user.getLastname()).isEqualTo("default last name");
        assertThat(user.getEmail()).isEqualTo(OVERRIDE_DEFAULT_BUILDER_VALUE);
    }
}
