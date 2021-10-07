import org.junit.Test;

/**
 * @author 五香加孜然
 * @creat2021--10--02--22:00
 */
public class StringTest {

    @Test
    public void indexTest(){
        String s = "0,1,2";
        Integer i = 1;
        System.out.println(s.indexOf(i.toString()));
    }

}
