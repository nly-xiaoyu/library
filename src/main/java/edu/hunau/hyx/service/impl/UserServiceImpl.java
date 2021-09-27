package edu.hunau.hyx.service.impl;


import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.bean.UserExample;
import edu.hunau.hyx.mapper.UserMapper;
import edu.hunau.hyx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 五香加孜然
 * @creat2021--09--09--10:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper usermapper;

}
