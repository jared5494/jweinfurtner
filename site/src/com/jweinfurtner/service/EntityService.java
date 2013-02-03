package com.jweinfurtner.service;

import java.util.Collection;

public interface EntityService {

	public void save(Object entity);
	
	public void saveAll(Object... entities);
	
	public void saveAll(final Collection<? extends Object> entities);
	
	public void remove(Object entity);
	
	public void removeAll(Object... entities);
	
	public void removeAll(final Collection<? extends Object> entities);
}
