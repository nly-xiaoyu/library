import edu.hunau.hyx.util.MD5Util;
import org.junit.Test;

/**
 * @author 五香加孜然
 * @creat2021--09--09--12:28
 */
public class MD5UtilTest {

    @Test
    public void MD5UtilTest(){
        String s = "123";
        MD5Util md5Util = new MD5Util();
        String md5 = md5Util.stringMD5(s);
        System.out.println(md5);


    }
}
