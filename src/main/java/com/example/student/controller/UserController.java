package com.example.student.controller;

import com.example.student.pojo.User;
import com.example.student.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/index")
    public String index(){
        return "/tables";
    }


    @GetMapping("/test")
    public String test(Model model){
        return "user_list";
    }
    @GetMapping("/list")
    public String list(Integer offset,Model model){
        Integer limit = 5;
        PageInfo<User> pageInfo = userService.findAll(offset,limit);
        model.addAttribute("pageInfo",pageInfo);
        System.out.println(model.getAttribute("pageInfo"));
        return "user_list";
    }
}
