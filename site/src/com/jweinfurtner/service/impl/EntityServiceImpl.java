package com.jweinfurtner.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodb.datamodeling.DynamoDBMapper;
import com.jweinfurtner.service.EntityService;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 * 
 */
@Service
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class EntityServiceImpl implements EntityService {

	@Autowired
	private DynamoDBMapper mapper;

	public void save(Object entity) {
		mapper.save(entity);
	}

	public void saveAll(final Object... entities) {
		mapper.batchSave(entities);
	}

	@Override
	public void saveAll(Collection<? extends Object> entities) {
		mapper.batchSave(entities);
	}

	@Override
	public void remove(Object entity) {
		mapper.delete(entity);
	}

	@Override
	public void removeAll(Object... entities) {
		mapper.batchDelete(entities);
	}

	@Override
	public void removeAll(Collection<? extends Object> entities) {
		mapper.batchDelete(entities);
	}

}
