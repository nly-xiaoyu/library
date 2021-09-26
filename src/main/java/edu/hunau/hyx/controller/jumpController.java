package edu.hunau.hyx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 五香加孜然
 * @creat2021--09--09--17:24
 */
@Controller
public class jumpController {
    @GetMapping("/registerController")
    public ModelAndView jumptoRegister(HttpServletRequest request, HttpServletResponse response)throws Exception{
        return new ModelAndView("page/regiester");
    }

    @GetMapping("/userLoginController")
    public ModelAndView jumptoUserLogin(HttpServletRequest request, HttpServletResponse response)throws Exception{
        return new ModelAndView("page/userLogin");
    }

}
