package edu.hunau.hyx.controller;

import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.service.UserService;
import edu.hunau.hyx.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author 五香加孜然
 * @creat2021--09--09--12:49
 */
@Controller
public class userController {

    @Autowired
    UserService userService;

    //用户注册
    @PostMapping("/register")
    public String register( HttpServletRequest request, HttpServletResponse response , User user)throws Exception{
        System.out.println(user);
        return "success";
    }

    //用户登录
    @PostMapping("/user/login")
    public ModelAndView userLogin(User user , HttpServletRequest request,HttpServletResponse response)throws Exception{
        //获取默认返回页面

        return null;

    }
    //用户退出登录
    @GetMapping("/user/logout")
    public ModelAndView userLogout (HttpServletRequest request,HttpServletResponse response)throws Exception {
        //清除登录信息
        request.getParameterMap().clear();
        ModelAndView mv = new ModelAndView("redirect:/index.html");
        return mv;
    }
}







