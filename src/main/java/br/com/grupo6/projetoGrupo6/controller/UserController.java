package br.com.grupo6.projetoGrupo6.controller;

import br.com.grupo6.projetoGrupo6.entities.User;
import br.com.grupo6.projetoGrupo6.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
       List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findyById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok().body(user);
    }

}
