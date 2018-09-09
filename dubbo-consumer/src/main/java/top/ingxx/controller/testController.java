package top.ingxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.ingxx.pojo.User;
import top.ingxx.service.UserService;

import java.util.List;
@Controller
@RequestMapping("/")
public class testController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("test")
    public String test(){
        return "hello";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public String selectAll(){
        List<User> users = userService.selectAll();
        return users.toString();
    }
}
