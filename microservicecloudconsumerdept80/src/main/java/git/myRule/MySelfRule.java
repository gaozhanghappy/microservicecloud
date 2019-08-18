package git.myRule;

import com.netflix.loadbalancer.IRule;
import git.myRule.mySelfRule.MySelfRule_zy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/8/18.
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new MySelfRule_zy();
    }
}
