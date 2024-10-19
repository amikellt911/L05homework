package cn.edu.zucc.config;
import cn.edu.zucc.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    //将此返回的值生成一个bean
    @Bean("user1")
    public User user() {
        User user = new User();
        user.setId(32201175);
        user.setName("llt");
        return user;
    }

}
