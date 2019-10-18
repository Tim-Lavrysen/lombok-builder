package be.tim.multiple_pojo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "FriendStaticBuilder", builderMethodName = "aFriend")
public class FriendBuilder extends Friend {
    @Builder.Default
    public String whatWasHisNameAgain = "I have no idea";

    public static FriendStaticBuilder aFriend() {
        return new FriendStaticBuilder();
    }
}
