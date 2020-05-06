package discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * Entry point for Pictogram Discovery Service.
 * 
 * @author Vaibhav Saxena
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class PictogramDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PictogramDiscoveryServiceApplication.class, args);
	}

}
