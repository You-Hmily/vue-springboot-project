package org.hmily.backend.springbootbackend.controller;

import java.util.List;

import org.hmily.backend.springbootbackend.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    //@Autowired
    //private UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<User> UserQry() {
        //return userService.getUser();
        return null;
    }

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public void UserAdd(User user){
        //userService.AddUser(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.PUT)
    public void UserUpdate(User user){
        //userService.updateUserByNo(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.DELETE)
    public void UserDel(@RequestParam(value="no") int no){
        //userService.delUserById(no);
    }
}