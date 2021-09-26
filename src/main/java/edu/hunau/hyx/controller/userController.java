package edu.hunau.hyx.controller;

import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.service.UserService;
import edu.hunau.hyx.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping("/register")
    public ModelAndView register(HttpSession session, HttpServletRequest request, HttpServletResponse response , User user)throws Exception{
        //设置默认跳转页面为当前页面
        ModelAndView mv = new ModelAndView("/page/regiester");
        //System.out.println(user);
        //判断学号是否存在
        List<User> users = userService.queryBySno(user.getSno());
        System.out.println("1");
        if (!users.isEmpty()){
            System.out.println("1");
            mv.addObject("msg","该用户已经存在");
            return mv;
        }
        //密码md5加密处理
        String newpasswd = new MD5Util().stringMD5(user.getPassword());
        user.setPassword(newpasswd);
        int i = userService.insertUser(user);
        //注册用户
        if(i==1)
        return new ModelAndView("redirect:/page/404.html", HttpStatus.OK);
        session.setAttribute("msg","注册失败");
        return mv;
    }

    //用户登录
    @GetMapping("/user/login")
    public ModelAndView userLogin(User user , HttpServletRequest request,HttpServletResponse response)throws Exception{
        System.out.println(user);
        System.out.println("1");
        return null;
    }






}
