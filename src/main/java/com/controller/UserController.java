package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public ModelAndView hello(){
        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;
    }
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView loginSubmit(User user, HttpServletRequest request){
        request.getSession().invalidate();
        if (user.getEmail()==null||user.getEmail().isEmpty()){
            return new ModelAndView("/login","message","邮箱不能为空");
        }
        if(user.getPassword()==null||user.getPassword().isEmpty()){
            return new ModelAndView("/login","message","密码不能为空");
        }
        user=userService.queryObject(user.getEmail());
        if (user == null){
            return new ModelAndView("/login","message","用户名或密码错误");
        }
        else {
            request.getSession().setAttribute("user",user);
            return  new ModelAndView("redirect:/");
        }

    }
}
