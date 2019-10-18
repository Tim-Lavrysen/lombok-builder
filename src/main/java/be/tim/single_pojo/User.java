package be.tim.single_pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Getter
    private String firstname;

    @Getter
    private String lastname;

    @Getter
    private String email;
}
