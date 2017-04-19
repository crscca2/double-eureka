package server1;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer1 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationEurekaServer1.class)
        	.web(true)
        	.run(args);
    }
}