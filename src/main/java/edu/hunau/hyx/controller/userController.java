package edu.hunau.hyx.controller;

import edu.hunau.hyx.bean.Response;
import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.service.UserService;
import edu.hunau.hyx.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 五香加孜然
 * @creat2021--09--09--12:49
 */
@Controller
@RestController
public class userController {

    @Autowired
    UserService userService;

    //用户注册
    @PostMapping("/register")
    public ResponseEntity<Response> register(HttpServletRequest request, HttpServletResponse response , User user)throws Exception{
        //初始化返回信息
        Response resp = new Response();
        //用户已经注册
        if(userService.queryByUsername(user.getUsername())){
            resp.setMsg("该用户已经存在");
            resp.setStatus(400);
        }else{
            //明文加密
            StringBuffer buffer = new StringBuffer(user.getPassword());
            //加上特殊字符 防止暴力破解
            String newpassward = buffer.append("library").toString();
            newpassward = new MD5Util().stringMD5(newpassward);
            user.setPassword(newpassward);
            user.setPid(0);
            userService.insertUser(user);
            resp.setMsg("注册成功");
            resp.setStatus(200);
        }
        return new ResponseEntity<Response>(resp, HttpStatus.OK);

    }

    //用户登录
    @PostMapping("/login")
    public ResponseEntity<Response> userLogin(User user , HttpServletRequest request,HttpServletResponse response ,HttpSession session )throws Exception{
        //获取默认返回页面
        Response resp = new Response();
        System.out.println(user);
        //查询用户名时候存在
        if(userService.queryByUsername(user.getUsername())){
            //明文加密
            StringBuffer buffer = new StringBuffer(user.getPassword());
            //加上特殊字符 防止暴力破解
            String newpassward = buffer.append("library").toString();
            newpassward = new MD5Util().stringMD5(newpassward);
            user.setPassword(newpassward);
            int i = userService.queryByUsernameAndPassword(user.getUsername(), user.getPassword());
            if(i!=-1){
                user = userService.selectByUsername(user.getUsername());
                session.setAttribute("User",user);
                resp.setMsg("登陆成功");
                resp.setStatus(200);
            }else{
                resp.setMsg("用户名或者密码错误");
                resp.setStatus(400);
            }

        }else{
            resp.setMsg("用户不存在");
            resp.setStatus(400);
        }
        return new ResponseEntity<Response>(resp, HttpStatus.OK);

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







