package cn.edu.zucc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import cn.edu.zucc.entity.User;

@SpringBootTest
class L05IocApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void testIoc() {
        User user = (User) applicationContext.getBean("user1");
        System.out.println(user);
    }
    
	@Test
	void contextLoads() {
	}

}
