
import edu.hunau.hyx.bean.User;
import edu.hunau.hyx.service.UserService;
import edu.hunau.hyx.util.MD5Util;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 五香加孜然
 * @creat2021--09--09--11:11
 */
public class userSericeTest {
    @Autowired
    UserService userserice;
    @Test
    public void userInsertTest(){
        User user = new User();
        user.setUsername("wuxiang");
        user.setPassword(new MD5Util().stringMD5("123456"));
        System.out.println(user);
        //userserice.insertUser(user);
    };
    @Test
    public void userquery(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword(new MD5Util().stringMD5("123456library"));
        System.out.println(user);
        //userserice.insertUser(user);
    };

}
