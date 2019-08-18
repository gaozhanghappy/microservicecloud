package git.gaozhanghappy.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2019/8/18.
 */
@Configuration//boot优化了spring 之前spring用的是文件applicationContext.xml配置类，现在没有这个文件了，用注解configuration
public class ConfigBean {
    @Bean
    @LoadBalanced  //客户端开启负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Bean
    public IRule myRue(){
        return new RandomRule();//如果这里配置，默认的将被取代
    }
}
//applicationContext.xml=configBean(@configuration)
// <bean id="userService" class="。。。。类型。">
