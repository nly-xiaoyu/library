package edu.hunau.hyx.controller;

import edu.hunau.hyx.bean.Response;
import edu.hunau.hyx.bean.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 五香加孜然
 * @creat2021--10--01--16:56
 */
@Controller
public class pageController {

    public ResponseEntity<Response> init(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception{
        Response resp = new Response();
        User user =(User) session.getAttribute("User");

        return null;
    }

    /*@GetMapping("/init")
    public String initjson(HttpSession session,HttpServletRequest request, HttpServletResponse response) throws Exception{
        User user =(User) session.getAttribute("User");
        if(user==null){
            return "redirect:/api/init.json";
        }else if (user.getPid()==1){
            return "redirect:/api/user.json";
        }else if (user.getPid()==2){
            return "redirect:/api/admin.json";
        }else{
            return "redirect:/api/init.json";
        }

    }*/
}
