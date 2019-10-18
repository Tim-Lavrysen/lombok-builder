package be.tim.multiple_pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserWithAFriend {

    @Getter
    private String firstname;

    @Getter
    private String lastname;

    @Getter
    private String email;

    @Getter
    private Friend friend;
}
