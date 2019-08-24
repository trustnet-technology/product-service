package com.trustnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@SpringBootApplication
public class TrustnetApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(TrustnetApplication.class, args);
		/*
		 * BasicAWSCredentials awsCreds = new
		 * BasicAWSCredentials("AKIAXUHOSHA44HHJ5JBE",
		 * "iJNmffcFgV7fv1PKjoD7sceQcf57q6zm3mEEs1Ts"); AmazonRDS rdsClient =
		 * AmazonRDSClientBuilder.standard() .withCredentials(new
		 * AWSStaticCredentialsProvider(awsCreds)) .build(); DescribeDBInstancesRequest
		 * request = new DescribeDBInstancesRequest(); DescribeDBInstancesResult result
		 * = rdsClient.describeDBInstances(request); List<DBInstance> list =
		 * result.getDBInstances();
		 */
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("swagger-ui.html")
	      .addResourceLocations("classpath:/META-INF/resources/");
	 
	    registry.addResourceHandler("/webjars/**")
	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
