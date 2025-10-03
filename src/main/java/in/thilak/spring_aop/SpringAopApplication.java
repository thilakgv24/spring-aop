package in.thilak.spring_aop;

import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thilak.spring_aop.business.service.BusinessService;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
	private BusinessService businessService;

	public SpringAopApplication(BusinessService businessService) {
		this.businessService = businessService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("tha Value is {}",this.businessService.calculateMax());
		System.out.println(this.businessService.calculateSum());
		//throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
