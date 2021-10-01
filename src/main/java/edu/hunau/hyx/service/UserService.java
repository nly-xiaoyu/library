package edu.hunau.hyx.service;


import edu.hunau.hyx.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author 五香加孜然
 * @creat2021--09--09--10:40
 */
@Service
public interface UserService {
    /**
     *
     */
    public boolean queryByUsername(String username);

    public int insertUser(User user);

    public int queryByUsernameAndPassword(String username, String password);

    public User selectByUsername(String username);
}
