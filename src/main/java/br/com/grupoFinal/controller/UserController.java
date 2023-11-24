package br.com.grupoFinal.controller;

import br.com.grupoFinal.entities.User;
import br.com.grupoFinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){
       List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findyById(id);
        return ResponseEntity.ok().body(user);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User create(@RequestBody User user){
        return this.userService.create(user);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id , @RequestBody User user){
        return this.userService.update(id, user);
    }

    @RequestMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id){
        this.userService.delete(id);
    }

}
