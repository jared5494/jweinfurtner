/**
 * 
 */
package com.jweinfurtner.converter;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 *
 */
public abstract class AbstractConverter<SOURCE, TARGET> implements Converter<SOURCE, TARGET> {

	protected abstract TARGET createTarget();
	
	protected abstract void populate(SOURCE source, TARGET target);
	
	@Override
	public TARGET convert(SOURCE source) {
		TARGET target = createTarget();
		
		populate(source, target);
		
		return target;
	}
}
