package br.com.raulcastro.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {
    /**
     * String (texto)
     * Integer (double) Números 0.0000
     * Double (double) Números 0.0000
     * Float (float) Números 0.0000
     * Date (data)
     * void
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){
        System.out.println(userModel.getUsername());
    }
}
