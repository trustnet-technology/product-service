package com.trustnet.queue;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.MessageAttributeValue;
import com.amazonaws.services.sqs.model.SendMessageRequest;

@Component
public class SqsManager {
	@Autowired
	AmazonSQS amazonSQS;
	
	@Value("${amazon.aws.sqs.url}")
	private String awsSqsUrl;
	
	//TODO: abstract it to handle queuUrl for different Queues
	// ASYNC
	public void sendMessage(JSONObject json) {
	    // Send message to SQS
		System.out.println(json);
	    
	    // Message Attributes
		Map<String, MessageAttributeValue> messageAttributes = new HashMap<>();
		messageAttributes.put("AttributeOne", new MessageAttributeValue()
		  .withStringValue("This is an attribute")
		  .withDataType("String"));  
		     
		// SendMessage Requests
		final SendMessageRequest sendMessageStandardQueue = new SendMessageRequest()
		  .withQueueUrl(awsSqsUrl)
		  .withMessageBody(json.toString())
		  .withDelaySeconds(0)
		  .withMessageAttributes(messageAttributes);
		 
		// Send to SQS
		//TODO: Make it Async
		amazonSQS.sendMessage(sendMessageStandardQueue);
	}

}
