import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 五香加孜然
 * @creat2021--10--02--16:28
 */
public class maptojsontest {

    @Test
    public void maptest(){
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("title","首页");
        homeInfo.put("href","/page/welcome-1.html?t=1");
        Map menu = new HashMap<>();
        menu.put("homeInfo",homeInfo);
        Map<String, String> logoInfo = new HashMap<>();
        logoInfo.put("title","library");
        logoInfo.put("image","/images/logo.png");
        logoInfo.put("href","");
        menu.put("logoInfo",logoInfo);
        List menuInfo = new ArrayList<>();
        List<Map> menuInfoItems = new ArrayList<>();
        ResponseEntity<Map> entity = new ResponseEntity<>(menu, HttpStatus.OK);
        System.out.println(entity);


    }
}
