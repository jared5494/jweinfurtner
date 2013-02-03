/**
 * 
 */
package com.jweinfurtner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodb.datamodeling.DynamoDBQueryExpression;
import com.amazonaws.services.dynamodb.model.AttributeValue;
import com.jweinfurtner.service.EntityService;
import com.jweinfurtner.service.SearchService;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 *
 */
@Service
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SearchServiceImpl implements SearchService {

	@Autowired
	private DynamoDBMapper mapper;
	
	public void lol(){
		AttributeValue hashKeyValue = new AttributeValue().withS("test").withS("another");
		DynamoDBQueryExpression queryExpress = new DynamoDBQueryExpression(hashKeyValue);
		
		mapper.query(String.class, queryExpress);
		
	}
}
