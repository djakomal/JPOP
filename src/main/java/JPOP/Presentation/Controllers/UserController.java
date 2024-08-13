package JPOP.Presentation.Controllers;


import JPOP.Presentation.Dtos.UserDto;
import JPOP.Presentation.Models.User;
import JPOP.Presentation.ServiceImpl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@Controller
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAll() {
        return userService.getAll();

    }
    @PostMapping("/")
    public User add(@RequestBody User user){
        return  userService.add(user);
    }


    @PutMapping("/update/{Id}")
    public UserDto update(@PathVariable Long Id, @RequestBody UserDto user) throws Exception{
        UserDto updatedUser = userService.update(Id,user);
        return  userService.update(Id, updatedUser);
    }

     @DeleteMapping("/delete/{id}")
    public  void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/get/{id}")
    public User getUserById(@PathVariable Long id){
        return  userService.getUserById(id);
    }

    @PostMapping("/login")
    public User login(@Valid @RequestBody User user)  {
        return userService.login(user);
    }
}
