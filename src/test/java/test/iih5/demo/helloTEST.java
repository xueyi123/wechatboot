/**
 * ---------------------------------------------------------------------------
 * 类名称   ：SearchControllerSpec
 * 类描述   ：
 * 创建人   ： xue.yi
 * 创建时间： 2016/5/12 14:00
 * 版权拥有：银信网银科技
 * ---------------------------------------------------------------------------
 */
package test.iih5.demo;

import com.iih5.springboot.demo.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Main.class)
@Rollback( value= true)
@Transactional
public class helloTEST {
    @Before
    public void setup() {
    }
    @Test
    public void test() throws Exception {
        //DB.M("t_user").set("nick_name","sb").updateById(1020101);
        System.out.println("hello,test!");
    }
}
