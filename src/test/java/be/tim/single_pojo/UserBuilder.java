package be.tim.single_pojo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderMethodName = "aUser")
public class UserBuilder extends User {
    @Builder.Default
    public String firstname = "default first name";
    @Builder.Default
    public String lastname = "default last name";
    @Builder.Default
    public String email = "default email";
}
