package post;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@EnableDiscoveryClient
@EnableFeignClients("post")
@SpringBootApplication
public class MicroservicePostApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicePostApplication.class, args);
	}

}
