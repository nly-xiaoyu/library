package edu.hunau.hyx.controller;

import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 五香加孜然
 * @creat2021--10--02--21:31
 */
@Controller
public class navController {

    @Autowired
    MenuService menuService;
    @GetMapping("/inittest")
    public ResponseEntity<Map> selectAllMenu(HttpSession session) throws  Exception {
        User user = (User)session.getAttribute("User");
        //获取全部的菜单
        List<Map<String, Object>> menuInfo=menuService.selectMenuByPre(user.getPid());
        Map homeInfo = new HashMap();
        homeInfo.put("title","首页");
        homeInfo.put("href","page/welcome-1.html?t=1");
        Map logoInfo = new HashMap();
        logoInfo.put("title","LAYUI ADMIN");
        logoInfo.put("image","images/logo.png");
        logoInfo.put("href","");
        Map map = new HashMap();
        map.put("homeInfo",homeInfo);
        map.put("logoInfo",logoInfo);
        map.put("menuInfo",menuInfo);
        return  new ResponseEntity<Map>(map, HttpStatus.OK);
    }
}
