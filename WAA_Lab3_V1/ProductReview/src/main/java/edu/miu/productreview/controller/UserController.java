package edu.miu.productreview.controller;

import edu.miu.productreview.model.Users;
import edu.miu.productreview.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUsersService usersService;

    @GetMapping
    public List<Users> getAllUser() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<Users> getUserById(@PathVariable int id) {
        return usersService.getUserById(id);
    }

    @PostMapping
    public Users createUser( @RequestBody Users users) {
        return usersService.createUser(users);
    }

    @PutMapping
    public Users updateUser(@RequestBody Users users) {
        return usersService.updateUser(users);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        usersService.deleteUserById(id);
    }

}
