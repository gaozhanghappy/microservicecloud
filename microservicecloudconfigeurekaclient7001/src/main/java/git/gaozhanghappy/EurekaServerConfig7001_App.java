package git.gaozhanghappy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableEurekaServer   //接受其他服务注册进来
public class EurekaServerConfig7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerConfig7001_App.class, args);
    }
}
