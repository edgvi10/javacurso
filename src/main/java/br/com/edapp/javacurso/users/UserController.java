package br.com.edapp.javacurso.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("")
    public String create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);

        return "User created!";
    }

    @GetMapping("")
    public String index() {
        return "Hello World!";
    }
}
