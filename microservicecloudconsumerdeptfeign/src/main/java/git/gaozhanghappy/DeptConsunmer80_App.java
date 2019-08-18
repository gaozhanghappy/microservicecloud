package git.gaozhanghappy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "git.gaozhanghappy")
@ComponentScan("git.gaozhanghappy")
public class DeptConsunmer80_App
{
    public static void main( String[] args )
    {
        SpringApplication.run(DeptConsunmer80_App.class,args);
    }
}
