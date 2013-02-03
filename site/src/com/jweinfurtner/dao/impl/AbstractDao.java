package com.jweinfurtner.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jweinfurtner.service.EntityService;

public class AbstractDao<T> {

	@Autowired
	private EntityService amazonDynamoDBService;
	
	public T find(){
		return null;
	}
}
