package edu.hunau.hyx.service;


import edu.hunau.hyx.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 五香加孜然
 * @creat2021--09--09--10:40
 */
@Service
public interface UserService {
    /**
     *
     */
    public int insertUser(User user);

    public boolean queryByUsernameAndpassward(String username, String password);

    public List<User> queryBySno(Integer sno);

}
