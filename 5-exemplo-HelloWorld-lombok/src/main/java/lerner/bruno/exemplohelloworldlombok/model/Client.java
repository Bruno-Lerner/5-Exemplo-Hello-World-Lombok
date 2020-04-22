package lerner.bruno.exemplohelloworldlombok.model;

import lombok.*;

/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 11:02
 */
@ToString(exclude = "lastName")
@NoArgsConstructor @AllArgsConstructor
public class Client {

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String email;
}
