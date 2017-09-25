package com.example.demo.Controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@RestController
//public class UserController {
//    @RequestMapping("/")
//    public ModelAndView userInfo() {
//        ModelAndView mv = new ModelAndView("index");
//        mv.addObject(new User(123L,"abc"));
//        return mv;
//    }
//}
@RestController
public class UserController {
    List<User> userList = new ArrayList();

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public List<User> getuser() {

        userList.add(new User(1, "a"));
        userList.add(new User(2, "b"));
        userList.add(new User(3, "c"));
        userList.add(new User(4, "d"));
        return userList;
    }

    @RequestMapping(value = "/postuser", method = RequestMethod.POST,consumes="application/json")
//    public User postuser(@RequestBody User user){
//        System.out.println(user);
//        return user;
//    }
    public List<User> postuser(@RequestBody User user) {
        userList.add(user);
        return userList;
    }
}
//@Controller
//public class UserController {
//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("loginName", "admin");
//        model.addAttribute("loginId", "27");
//        return "index";
//    }
//}
