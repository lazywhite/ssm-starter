package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.entity.User;
import ssm.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by white on 17/7/20.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public ModelAndView findAll(){
        ModelAndView mav = new ModelAndView();
        List<User> users = userService.findAll();
        mav.setViewName("user/list");
        mav.addObject("users", users);
        return mav;
    }

    @RequestMapping("/add")
    public String add(User u){
        userService.add(u);
        return "user/login";
    }

    @RequestMapping("/login")
    public String login(User u, HttpServletRequest request){
        User user = userService.login(u);
        if(user != null){
            request.getSession().setAttribute("currentUser", user);
            return "index";
        }
        return "user/login";
    }

    @RequestMapping("/logout")
    public String login(HttpServletRequest request){
        request.getSession().removeAttribute("currentUser");
        return "user/login";
    }

    @RequestMapping("/register")
    public String login(){
        return "user/register";
    }
}
