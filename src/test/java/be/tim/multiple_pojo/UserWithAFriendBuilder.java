package be.tim.multiple_pojo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderMethodName = "aUserWithAFriend")
public class UserWithAFriendBuilder extends UserWithAFriend {
    @Builder.Default
    public String firstname = "default first name";
    @Builder.Default
    public String lastname = "default last name";
    @Builder.Default
    public String email = "default email";
    @Builder.Default
    public Friend friend = FriendBuilder.aFriend().build();

}
