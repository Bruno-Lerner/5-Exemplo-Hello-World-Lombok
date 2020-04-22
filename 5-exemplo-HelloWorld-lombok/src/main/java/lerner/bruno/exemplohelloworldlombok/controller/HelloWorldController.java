package lerner.bruno.exemplohelloworldlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Bruno Lerner
 * @version 1.0
 * @since 15/04/2020 11:05
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Agora sim, com lombok sou dev já!";
    }
}
