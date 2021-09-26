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
    public int insertUser(User user) {
        return usermapper.insert(user);
    }

    @Override
    public boolean queryByUsernameAndpassward(String username, String password) {
        UserExample userexample = new UserExample();
        UserExample.Criteria criteria = userexample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        usermapper.selectByExample(userexample);
        return false;
    }

    @Override
    public List<User> queryBySno(Integer sno) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andSnoEqualTo(sno);
        List<User> users = usermapper.selectByExample(example);
        return users;
    }
}
