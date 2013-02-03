package com.jweinfurtner.converter;

public interface Converter<SOURCE, TARGET> {

	TARGET convert(SOURCE source);
}
