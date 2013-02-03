package com.jweinfurtner;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.services.dynamodb.AmazonDynamoDB;
import com.amazonaws.services.dynamodb.AmazonDynamoDBClient;

@Configuration
public class SiteConfig {

	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public ClientConfiguration clientConfiguration() {
		ClientConfiguration clientConfiguration = new ClientConfiguration();
		return clientConfiguration;

	}

	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public AmazonDynamoDB amazonDynamoDB() {
		return new AmazonDynamoDBClient(clientConfiguration());
	}
}
