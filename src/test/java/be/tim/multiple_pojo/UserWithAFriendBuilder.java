package be.tim.multiple_pojo;

import lombok.Builder;
import lombok.Getter;

import static be.tim.multiple_pojo.FriendBuilder.aFriend;

@Getter
@Builder(builderClassName = "UserWithAFriendStaticBuilder", builderMethodName = "aUserWithAFriend")
public class UserWithAFriendBuilder extends UserWithAFriend {
    @Builder.Default
    public String firstname = "default first name";
    @Builder.Default
    public String lastname = "default last name";
    @Builder.Default
    public String email = "default email";
    @Builder.Default
    public Friend friend = aFriend().build();

    public static UserWithAFriendStaticBuilder aUserWithAFriend() {
        return new UserWithAFriendStaticBuilder();
    }
}
