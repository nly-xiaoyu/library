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

    @Override
    public boolean queryByUsername(String username) {
        //若存在该用户则返回真值
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = usermapper.selectByExample(userExample);
        return users.size()>0;
    }

    @Override
    public int insertUser(User user) {
        return usermapper.insert(user);
    }

    @Override
    public int queryByUsernameAndPassword(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        userExample.createCriteria().andPasswordEqualTo(password);
        List<User> users = usermapper.selectByExample(userExample);
        if(users.size()==0){
            System.out.println("-1");
            return -1;
        }else {
            System.out.println("-");
            return users.get(0).getId();
        }
    }

    @Override
    public User selectByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = usermapper.selectByExample(userExample);
        return users.get(0);
    }
}
