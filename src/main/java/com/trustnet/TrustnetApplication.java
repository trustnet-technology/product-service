package com.trustnet;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.AmazonRDSClientBuilder;
import com.amazonaws.services.rds.model.DBInstance;
import com.amazonaws.services.rds.model.DescribeDBInstancesRequest;
import com.amazonaws.services.rds.model.DescribeDBInstancesResult;

@SpringBootApplication
public class TrustnetApplication {

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

}
