package com.MA.AlrightBet.Controller;
import com.MA.AlrightBet.Entity.FightCard;
import com.MA.AlrightBet.Entity.User;
import com.MA.AlrightBet.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class User_Controller {

    @Autowired
    UserService userService;



    @GetMapping("/user")
    public List<User> get_all() {
        return this.userService.fetch_all_users();
    }

    @GetMapping("/user/{id}") // GET ID
    public User getByID(@PathVariable int id) {
        return this.userService.getUserById(id);
    }

    @PostMapping("/user")
    public User create(@RequestBody User user) {
        return this.userService.create_user(user);
    }

    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable int id) {
        return this.userService.delete_user(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody User user) {
        return this.userService.update_user(user);
    }

}
